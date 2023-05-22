/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.felipy_hospital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author lukas
 */
public class Enfermeiro extends Funcionario{
    private String coren;
    private List<Plantao> plantoes;
    private List<String> procedimentos;

    public Enfermeiro(String nome, Double salario, String coren) {
        super(nome, salario);
        this.coren = coren;
        this.plantoes = new ArrayList();
        this.procedimentos = new ArrayList();
    }
    
    @Override
    public Double getSalario(){
        return super.getSalario() + (plantoes.size() * 80.00);
    }
    
    public void aplicarMedicacao(){
        System.out.println("Medicação aplicada");
        procedimentos.add("Aplicação de medicação");
    }
    
    public void realizarTriagem(){
        System.out.println("Realizando triagem");
        procedimentos.add("Triagem");
    }
    
    public void realizarPlantao(){
        Integer dia = LocalDate.now().getDayOfMonth();
        Integer mes = LocalDate.now().getMonthValue();
        Integer ano = LocalDate.now().getYear();
        Boolean verificador = true;
        for (Plantao plantao: plantoes) {
            if (plantao.getDia().equals(dia) && plantao.getMes().equals(mes) && plantao.getAno().equals(ano)) {
                verificador = false;
            }
        }
        if (verificador) {
            Plantao plantao = new Plantao(dia, mes, ano);
            plantoes.add(plantao);
        }
    }

    public Integer getQtdProcedimentosRealizados() {
        return procedimentos.size();
    }
    
    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public Integer getQtdPlantao() {
        return plantoes.size();
    }


    public Integer getQuantidadeDeProcedimentosPorNome(String procedimento) {
        Integer qtd = 0;
        for (String procedimentoDaVez: procedimentos) {
            if (procedimentoDaVez.equalsIgnoreCase(procedimento)) {
                qtd++;
            }
        }
        return qtd;
    }
    
    @Override
    public String toString() {
        return String.format("""
                             %s
                             coren: %s
                             Quantidade de plantoes: %d
                             Quantidade procedimentos realizados: %d""",
                super.toString(), 
                coren,
                plantoes.size(),
                procedimentos.size()
        );
    }
    
}
