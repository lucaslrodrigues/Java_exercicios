/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.atividade.classe.abstrata.funcionario;

/**
 *
 * @author lukas
 */
public abstract class Funcionario {
    protected String cpf;
    protected String nome;

    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public abstract Double calcularSalario();
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("""
                             -------------------------------------------------------------------
                             Nome: %s
                             Cpf: %s
                             """,
                nome, 
                cpf);
    }
}
