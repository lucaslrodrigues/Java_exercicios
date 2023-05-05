/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.ac2.segunda.atividade;

/**
 *
 * @author lukas
 */
public class TesteAtividade {
    public static void main(String[] args) {
        Atividade atividade1 = new Atividade("Criar tela de login com Jframe","Lucas de Lima",2);
        Atividade atividade2 = new Atividade("Criar diagramas de classe da sprint","Tarciso Paiva",2);
        Atividade atividade3 = new Atividade("Estruturar a segunda sprint do projeto no planner","Leonardo Cardoso",3);
        Atividade atividade4 = new Atividade("Documentar solução tecnica do projeto individual","Nathan David",0);

        atividade1.terminarAtividade(2);
        
        atividade2.terminarAtividade(1);        
        
        atividade3.terminarAtividade(4);

        System.out.println(atividade1);
        atividade1.calcularTempo();
        System.out.println(atividade2);
        atividade2.calcularTempo();
        System.out.println(atividade3);
        atividade3.calcularTempo();
    }
}
