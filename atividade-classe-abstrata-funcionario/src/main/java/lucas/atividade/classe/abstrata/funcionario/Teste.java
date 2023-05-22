/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.atividade.classe.abstrata.funcionario;

/**
 *
 * @author lukas
 */
public class Teste {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa();
        
        Vendedor funcionario1 = new Vendedor(54000.00, 10.5, "478512354332","Silva Teles");
        Horista funcionario2 = new Horista(120, 10.00, "478512354332","Paula Maria");
        
        empresa1.adicionarFunc(funcionario1);
        empresa1.adicionarFunc(funcionario2);
        
        empresa1.exibeTodos();
        empresa1.exibeTotalSalario();
    }
}
