/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.atividade.kanbam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lukas
 */
public class Sprint {
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private List<Task> tarefas;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMMM/yyyy HH:mm:ss");


    public Sprint() {
        this.inicio = LocalDateTime.now();
        this.fim = null;
        this.tarefas = new ArrayList<>();
    }
    
    public void adicionarTarefa(Task task){
        tarefas.add(task);
    }
    
    public void concluirTarefa(String titulo){
        for (Task task: tarefas) {
            if (task.getTitulo().equalsIgnoreCase(titulo)) {
                task.setFim(LocalDateTime.now());
            }
        }
    }
    
    public void concluirTarefaPeloIndex(Integer index){
        for (int i = 0; i < tarefas.size(); i++) {
            if (index.equals(i)) {
                tarefas.get(i).setFim(LocalDateTime.now());
            }
        }
    }
    
    public void exibirRelatorio(){
        System.out.println("-------------------Tarefas concluídas"
                        + "-------------------");
        Integer c = 0;
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getFim() != null){
                c++;
                System.out.println(String.format("""
                                                 %d - %s
                                                 inicio: %s
                                                 fim: %s
                                                 """, 
                        c, 
                        tarefas.get(i).getTitulo(), 
                        tarefas.get(i).getInicio().format(formatter),
                        tarefas.get(i).getFim().format(formatter)));
            }
        }
        c = 0;
        System.out.println("-------------------Tarefas pendentes"
                        + "-------------------");
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getFim() == null){
                c++;
                System.out.println(String.format("""
                                                 %d - %s
                                                 inicio: %s
                                                 fim:
                                                 """, 
                        c, 
                        tarefas.get(i).getTitulo(), 
                        tarefas.get(i).getInicio().format(formatter)));
            }
        }
    }
}
