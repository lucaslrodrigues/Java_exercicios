/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.primeiro.projeto.encapsulamento;

/**
 *
 * @author lukas
 */
public class ContaCorrente {
    // Atributos = Caracteristicas
    private String nomeTitular = "";
    private String cpf;
    private Double saldo = 0.0;
    
    // Metodos = Comportamentos
    
    // Sacar e retornar o saldo atual
    Double sacar(Double valorSaque){
        if (saldo > 0 && saldo >= valorSaque){
            saldo -= valorSaque;
            System.out.println("Saldo atual: "+ saldo);
        }else{
            System.out.println("Saldo insuficiente ou negativo");
        }
        return saldo;
    }
    
    void depositar(Double valorDepositar){
        if (valorDepositar > 0) {
            saldo += valorDepositar;
        }
            System.out.println("Saldo atual: "+ saldo);
    }
    
    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }
    
    public String getNomeTitular(){
        return nomeTitular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSaldo() {
        return saldo;
    }
}
