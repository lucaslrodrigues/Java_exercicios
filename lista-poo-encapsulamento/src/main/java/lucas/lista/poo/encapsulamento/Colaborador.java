/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lucas.lista.poo.encapsulamento;

/**
 *
 * @author lukas
 */
public class Colaborador {
    private String nome;
    private String cargo;
    private Double salario;

    public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    // Sobrecarga de construtor
    public Colaborador(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 1300.00;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    // Sobrescrita
    // Sobrescrevendo metodos
    @Override
    public String toString() {
        return String.format("\n----------------------------------\n"
        + "Colaborador: %d\n"
        + "Cargo: %d\n"
        + "Salário: %.2f", nome, cargo, salario);
    }
    
}
