/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.atividade.kanbam;

/**
 *
 * @author lukas
 */
public class Teste {
    public static void main(String[] args) throws InterruptedException {
        Task task1 = new Task("Arrumar backend do site");
        Task task2 = new Task("Emplementar o Slack");
        Task task3 = new Task("Diagrama de visão de negocios");
        
        Sprint sprint1 = new Sprint();
        sprint1.adicionarTarefa(task1);
        sprint1.adicionarTarefa(task2);
        sprint1.adicionarTarefa(task3);
        
        Thread.sleep(3000);
        
        sprint1.concluirTarefa("Arrumar backend do site");
        sprint1.concluirTarefaPeloIndex(2);
        
        sprint1.exibirRelatorio();
    }
}
