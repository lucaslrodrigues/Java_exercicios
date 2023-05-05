package listas;

import java.util.ArrayList;
import java.util.List;
import lucas.ac2.segunda.atividade.Atividade;

/**
 *
 * @author lukas
 */
public class TesteListaJava2 {
    public static void main(String[] args) {
        List listaEstranha = new ArrayList();
        
        listaEstranha.add("Xampson");
        listaEstranha.add(42);
        listaEstranha.add(42.5);
        listaEstranha.add(false);
        
        System.out.println(listaEstranha);
        
        List<String> listaNomes = new ArrayList();
        listaNomes.add("Maria");
        listaNomes.add("João");
        listaNomes.add("Bob");
        
        System.out.println(listaNomes);
        
        // Pegando o nome da posição 2
        String nome2 = listaNomes.get(2);
        System.out.println("Nome 2: " + nome2);
        
        // Pegando todas as posições
        for (int i = 0; i < listaNomes.size(); i ++){
            System.out.println(String.format("%d° nome: %s",i + 1, listaNomes.get(i)));
        }
        
        
        // Para remover um indice
        // listaNomes.remove("Bob");
        // OU
        // listaNomes.remove(2);
        
        for (int i = 0; i < listaNomes.size(); i++){
            if (listaNomes.get(i).equals("Bob")){
                listaNomes.remove(i);
            }
        }
        
        System.out.println(listaNomes);
        
        
        // listaNomes.remove(listaTemporariaParaRemover);
        // 
        listaNomes.clear();
        System.out.println(listaNomes);
        
        System.out.println("Lista de atuvudades");
        
        List<Atividade> Atividade = new ArrayList();
        
        Atividade atividade1 = new Atividade("Criar tela de login com Jframe", "Lucas de Lima", 2);
        Atividade atividade2 = new Atividade("Criar diagramas de classe da sprint", "Tarciso Paiva", 6);
        Atividade atividade3 = new Atividade("Estruturar a segunda sprint do projeto no planner", "Leonardo Cardoso", 7);
        Atividade atividade4 = new Atividade("Documentar solução tecnica do projeto individual", "Nathan David", 0);
        
        Atividade.add(atividade1);
        Atividade.add(atividade2);
        Atividade.add(atividade3);
        Atividade.add(atividade4);
        
        // INSTANCIANDO DIRETO NO ADD
        // Atividade.add(new Atividade("Criar tela de login com Jframe", "Lucas de Lima", 2));
        
        System.out.println("Mostrando atividades com menos de sete dias estimados");
        
        for (int i = 0; i < Atividade.size(); i++) {
            Atividade atividadeDaVez = Atividade.get(i);
            if(atividadeDaVez.getDiasEstimados() < 7){
                System.out.println("Atividade da vez");
            }
        }
        
        // enhancent for
        // Para percorrer a lista inteira
        for (Atividade atividadeDaVez : Atividade) {
            if(atividadeDaVez.getDiasEstimados() < 7){
                System.out.println("Atividade da vez");
            }
        }
    }
}
