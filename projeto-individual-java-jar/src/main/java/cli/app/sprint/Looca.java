/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli.app.sprint;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author lukas
 */
public class Looca {
        private List<UserLogin> user;
        private LogGenerator log;
        
        public Looca(List<UserLogin> user) throws IOException, InterruptedException {
            this.user = user;
            this.log = new LogGenerator();
            verificarPc();
        }
        
        public void verificarPc() throws IOException, InterruptedException {
        InserirMetrica im = new InserirMetrica();
        Conection conexao = new Conection();
        ConectionMySql conexao2 = new ConectionMySql();

        JdbcTemplate con = conexao.getConnection();
        JdbcTemplate con2 = conexao2.getConnection();

        InfoPc infoPc = new InfoPc();

        String so = infoPc.sistemaOperacional();

        String hostName = infoPc.hostName();

        List<Computador> listaComputador = con.query("select hostname,"
                + " sistemaOperacional, status from Computador where hostname = ?;",
                new BeanPropertyRowMapper(Computador.class), hostName);

        List<Computador> listaComputador2 = con2.query("select hostname,"
                + " sistemaOperacional, status from Computador where hostname = ?;",
                new BeanPropertyRowMapper(Computador.class), hostName);

        Integer computadorEncontrado = listaComputador.size();
        Integer computadorEncontrado2 = listaComputador2.size();

        if (computadorEncontrado > 0 && computadorEncontrado2 > 0) {
            System.out.println("Computador já cadastrado");
            im.inserirMetrica();
        } else {
            System.out.println("Computador não cadastrado");
            receberTipoDiscoSetor();
        }
    }
        
    public void receberTipoDiscoSetor() throws IOException, InterruptedException{
        String fileName = "config.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String setorRecebido = reader.readLine();
            String discoRecebido = reader.readLine();

            ProcessBuilder processBuilder = new ProcessBuilder("rm", fileName);
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            cadastrarPc(setorRecebido.toLowerCase(), discoRecebido.toLowerCase());

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivos do diretorio /app");
        }
    }

    public void cadastrarPc(String setor, String discoTipo) throws IOException {
        Conection conexao = new Conection();
        ConectionMySql conexao2 = new ConectionMySql();

        JdbcTemplate con = conexao.getConnection();
        JdbcTemplate con2 = conexao2.getConnection();

        InfoPc infoPc = new InfoPc();

        String hostName = infoPc.hostName();
//        String hostName = "TESTE SO";
        String mac = infoPc.mac();

        // DESCOMENTE ESSE CÓDIGO PARA TESTAR O CÓDIGO MAIS DE UMA VEZ NA MESMA MÁQUINA, POIS ELE GERA IDS DIFERENTES
        // SE AS DUAS LINHAS ABAIXO ESTIVEREM COMENTADAS A LINHA SEGUINTE DEVE ESTAR DESCOMENTADA
//        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 10001);
//        numeroSerial = String.valueOf(numeroAleatorio);
        String so = infoPc.sistemaOperacional();
//         if (so.equalsIgnoreCase("Windows")) {
//             numeroSerial = infoPc.numeroSerial();
//         } else {
//             numeroSerial = infoPc.numeroSerialLinux();
//         }
        Double freqCpu = infoPc.frequenciaCpu();
        Double qtdRam = infoPc.qtdRam();
        Double qtdArmazenamento = infoPc.qtdArmazenamento();
        Integer tipoDisco = null;
        Double redeMs = 1.0;

        if (discoTipo.equalsIgnoreCase("ssd")) {
            tipoDisco = 4;
        } else {
            tipoDisco = 5;
        }

        String status = "Operando";
        String fkEmpresa = null;

        for (UserLogin usuario : user) {
            fkEmpresa = usuario.getFkEmpresa();
        }

        List<Componente> componentes = con.query("select * from Componente;",
                new BeanPropertyRowMapper(Componente.class));

        List<Componente> componentes2 = con2.query("select * from Componente;",
                new BeanPropertyRowMapper(Componente.class));

        System.out.println("Componentes 1");
        System.out.println(componentes);
//        log.generateLog(componentes.toString());

        Boolean validarRede = false;
        Boolean validarRam = false;
        Boolean validarDiscoSSD = false;
        Boolean validarDiscoHD = false;
        Boolean validarCpu = false;

        Boolean validarRede2 = false;
        Boolean validarRam2 = false;
        Boolean validarDiscoSSD2 = false;
        Boolean validarDiscoHD2 = false;
        Boolean validarCpu2 = false;

        for (Componente comp : componentes) {
            if (comp.getFkTipo() == 1) {
                if (comp.getNumeroChave().equals(redeMs)) {
                    validarRede = true;
                }
            }

            if (comp.getFkTipo() == 3) {
                if (comp.getNumeroChave().equals(freqCpu)) {
                    validarCpu = true;
                }
            }

            if (comp.getFkTipo() == 2) {
                if (comp.getNumeroChave().equals(qtdRam)) {
                    validarRam = true;
                }
            }

            if (discoTipo.equalsIgnoreCase("ssd")) {
                if (comp.getFkTipo() == 4) {
                    if (comp.getNumeroChave().equals(qtdArmazenamento)) {
                        validarDiscoSSD = true;
                    }
                }
            } else {
                if (comp.getFkTipo() == 5) {
                    if (comp.getNumeroChave().equals(qtdArmazenamento)) {
                        validarDiscoHD = true;
                    }
                }
            }

        }
        
        System.out.println("Componentes 1");
        System.out.println(componentes);
        System.out.println("Componentes 2");
        System.out.println(componentes2);

        for (Componente comp : componentes2) {
            if (comp.getFkTipo() == 1) {
                if (comp.getNumeroChave().equals(redeMs)) {
                    validarRede2 = true;
                }
            }
            if (comp.getFkTipo() == 3) {
                if (comp.getNumeroChave().equals(freqCpu)) {
                    validarCpu2 = true;
                }
            }

            if (comp.getFkTipo() == 2) {
                if (comp.getNumeroChave().equals(qtdRam)) {
                    validarRam2 = true;
                }
            }

            if (discoTipo.equalsIgnoreCase("ssd")) {
                if (comp.getFkTipo() == 4) {
                    if (comp.getNumeroChave().equals(qtdArmazenamento)) {
                        validarDiscoSSD2 = true;
                    }
                }
            } else {
                if (comp.getFkTipo() == 5) {
                    if (comp.getNumeroChave().equals(qtdArmazenamento)) {
                        validarDiscoHD2 = true;
                    }
                }
            }

        }
        
        System.out.println("Componentes 1");
        System.out.println(componentes);
        System.out.println("Componentes 2");
        System.out.println(componentes2);

        if (validarRede == false) {
            int linhaComponenteCpu = con.update("insert into Componente (numeroChave, unidadeMedida, fkTipo) values (?, ?, ?)",
                    redeMs,
                    "ms",
                    1
            );
        }

        if (validarRede2 == false) {
            int linhaComponenteCpu2 = con2.update("insert into Componente (numeroChave, unidadeMedida, fkTipo) values (?, ?, ?)",
                    redeMs,
                    "ms",
                    1
            );
        }

        if (validarCpu == false) {
            int linhaComponenteCpu = con.update("insert into Componente (numeroChave, unidadeMedida, fkTipo) values (?, ?, ?)",
                    freqCpu,
                    "hz",
                    3
            );
        }

        if (validarCpu2 == false) {
            int linhaComponenteCpu2 = con2.update("insert into Componente (numeroChave, unidadeMedida, fkTipo) values (?, ?, ?)",
                    freqCpu,
                    "hz",
                    3
            );
        }

        if (validarRam == false) {
            int linhaComponenteRam = con.update("insert into Componente (numeroChave, unidadeMedida, fkTipo) values (?, ?, ?)",
                    qtdRam,
                    "gb",
                    2
            );

        }

        if (validarRam2 == false) {
            int linhaComponenteRam2 = con2.update("insert into Componente (numeroChave, unidadeMedida, fkTipo) values (?, ?, ?)",
                    qtdRam,
                    "gb",
                    2
            );
        }

        if (discoTipo.equalsIgnoreCase("ssd")) {
            if (validarDiscoSSD == false) {
                int linhaComponenteDisco = con.update("insert into Componente (numeroChave, unidadeMedida, fkTipo) values (?, ?, ?)",
                        qtdArmazenamento,
                        "gb",
                        tipoDisco
                );

            }
            if (validarDiscoSSD2 == false) {
                int linhaComponenteDisco = con2.update("insert into Componente (numeroChave, unidadeMedida, fkTipo) values (?, ?, ?)",
                        qtdArmazenamento,
                        "gb",
                        tipoDisco
                );

            }
        } else {
            if (validarDiscoHD == false) {
                int linhaComponenteDisco = con.update("insert into Componente (numeroChave, unidadeMedida, fkTipo) values (?, ?, ?)",
                        qtdArmazenamento,
                        "gb",
                        tipoDisco
                );
            }
            if (validarDiscoHD2 == false) {
                int linhaComponenteDisco2 = con2.update("insert into Componente (numeroChave, unidadeMedida, fkTipo) values (?, ?, ?)",
                        qtdArmazenamento,
                        "gb",
                        tipoDisco
                );
            }
        }

        int linhaLocalizacao = con.update("insert into Localizacao (setor) values (?)",
                setor
        );

        int linhaLocalizacao2 = con2.update("insert into Localizacao (setor) values (?)",
                setor
        );
        
        System.out.println("Componentes 1");
        System.out.println(componentes);
        System.out.println("Componentes 2");
        System.out.println(componentes2);
        
        List<Localizacao> loc = con.query("select idLocalizacao from Localizacao order by idLocalizacao desc",
                new BeanPropertyRowMapper(Localizacao.class));

        List<Localizacao> loc2 = con2.query("select idLocalizacao from Localizacao order by idLocalizacao desc",
                new BeanPropertyRowMapper(Localizacao.class));

        Integer fkLocalizacao = null;
        Integer fkLocalizacao2 = null;

        for (int i = 0; i < loc.size(); i++) {
            if (i == 0) {
                fkLocalizacao = loc.get(i).getIdLocalizacao();
            }
        }

        for (int i = 0; i < loc2.size(); i++) {
            if (i == 0) {
                fkLocalizacao2 = loc2.get(i).getIdLocalizacao();
            }
        }

        int linhasInseridas = con.update("insert into Computador values (?, ?, ?, ?, ?, ?)",
                hostName,
                status,
                so,
                mac,
                fkLocalizacao,
                fkEmpresa
        );

        int linhasInseridas2 = con2.update("insert into Computador values (?, ?, ?, ?, ?, ?)",
                hostName,
                status,
                so,
                mac,
                fkLocalizacao2,
                fkEmpresa
        );
        
        System.out.println("Componentes 1");
        System.out.println(componentes);
        System.out.println("Componentes 2");
        System.out.println(componentes2);

        // Fazendo associação na config
        
        List<Componente> componentesLocal = con2.query("select * from Componente;",
                new BeanPropertyRowMapper(Componente.class));
        System.out.println("Componentes Local");
        System.out.println( componentesLocal);
        Integer idRede = 0;
        for (Componente comp : componentes) {
            if (comp.getFkTipo() == 1) {
                if (comp.getNumeroChave().equals(redeMs)) {
                    idRede = comp.getIdComponente();
                    System.out.println(idRede + "rede Azure");
                }
            }
        }

        Integer idRam = 0;
        for (Componente comp : componentes) {
            if (comp.getFkTipo() == 2) {
                if (comp.getNumeroChave().equals(qtdRam)) {
                    idRam = comp.getIdComponente();
                    System.out.println(idRam + "ram Azure");
                }
            }
        }

        Integer idCpu = 1;
        for (Componente comp : componentes) {
            if (comp.getFkTipo() == 3) {
                if (comp.getNumeroChave().equals(freqCpu)) {
                    idCpu = comp.getIdComponente();
                    System.out.println(idCpu + "cpu Azure");
                }
            }
        }
        Integer idArmazenamento = 0;
        for (Componente comp : componentes) {
            if ((comp.getFkTipo() == 4) || (comp.getFkTipo() == 5)) {
                if (comp.getNumeroChave().equals(qtdArmazenamento)) {
                    idArmazenamento = comp.getIdComponente();
                    System.out.println(idArmazenamento + "armazenamento Azure");
                }
            }
        }

        // LOCAL
        
        Integer idRede2 = 0;
        for (Componente comp : componentesLocal) {
            System.out.println("Entrou no for de Rede");
            if (comp.getFkTipo() == 1) {
                System.out.println("Achou fk rede");
                if (comp.getNumeroChave().equals(redeMs)) {
                    idRede2 = comp.getIdComponente();
                    System.out.println(idRede2 + "rede local");
                }
            }
        }

        Integer idRam2 = 0;
        for (Componente comp : componentesLocal) {
            System.out.println("Entrou no for de RAM");
            if (comp.getFkTipo() == 2) {
                System.out.println("Achou fk ram");
                if (comp.getNumeroChave().equals(qtdRam)) {
                    idRam2 = comp.getIdComponente();
                    System.out.println(idRam2 + "ram local");
                }
            }
        }

        Integer idCpu2 = 0;
        for (Componente comp : componentesLocal) {
            System.out.println("Entrou no for de CPU");
            if (comp.getFkTipo() == 3) {
                System.out.println("Achou fk CPU");
                if (comp.getNumeroChave().equals(freqCpu)) {
                    idCpu2 = comp.getIdComponente();
                    System.out.println(idCpu2 + "cpu local");
                }
            }
        }
        Integer idArmazenamento2 = 0;
        for (Componente comp : componentesLocal) {
            System.out.println("Entrou no for de Armazenamento");
            if ((comp.getFkTipo() == 4) || (comp.getFkTipo() == 5)) {
                System.out.println("Achou fk armazenamento");
                if (comp.getNumeroChave().equals(qtdArmazenamento)) {
                    idArmazenamento2 = comp.getIdComponente();
                    System.out.println(idArmazenamento2 + "armazenamento local");
                }
            }
        }

        int associarRede = con.update("insert into Config (fkComputador, fkComponente) values (?,?)", hostName, idRede);
        int associarRede2 = con2.update("insert into Config (fkComputador, fkComponente) values (?,?)", hostName, idRede2);

        int associarRam = con.update("insert into Config (fkComputador, fkComponente) values (?,?)", hostName, idRam);
        int associarRam2 = con2.update("insert into Config (fkComputador, fkComponente) values (?,?)", hostName, idRam2);

        int associarCpu = con.update("insert into Config (fkComputador, fkComponente) values (?,?)", hostName, idCpu);
        int associarCpu2 = con2.update("insert into Config (fkComputador, fkComponente) values (?,?)", hostName, idCpu2);

        int associarArmazenamento = con.update("insert into Config (fkComputador, fkComponente) values (?,?)", hostName, idArmazenamento);
        int associarArmazenamento2 = con2.update("insert into Config (fkComputador, fkComponente) values (?,?)", hostName, idArmazenamento2);

        System.out.println("Computador cadastrado!");
        
        InserirMetrica metricas = new InserirMetrica();
        metricas.inserirMetrica();
    }
}
