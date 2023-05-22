/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.atividade.classe.abstrata.funcionario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lukas
 */
public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }
    
    public void adicionarFunc(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    
    public void exibeTodos(){
        for (Funcionario funcionarioDaVez: funcionarios) {
            System.out.println(funcionarioDaVez);
        }
    }
    
    public void exibeTotalSalario(){
        Double total = 0.0;
        for (int i = 0; i < funcionarios.size(); i++) {
            total += funcionarios.get(i).calcularSalario();
        }
        System.out.println("Total de salarios: " + total);
    }
}
