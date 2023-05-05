/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.primeiro.projeto.encapsulamento;

/**
 *
 * @author lukas
 */
public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente conta01 = new ContaCorrente();
        ContaCorrente conta02 = new ContaCorrente();
        
        conta01.setNomeTitular("Xampson");
        conta02.setNomeTitular("Xampinho");
        
        conta01.sacar(100.0);
        conta01.depositar(500.0);
        conta01.sacar(50.0);
        
        
    }
}
\