/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.atividade.classe.abstrata.funcionario;

/**
 *
 * @author lukas
 */
public class Horista extends Funcionario{
    private Integer qtdHora;
    private Double valorHora;

    public Horista(Integer qtdHora, Double valorHora, String cpf, String nome) {
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }
    
    public Double calcularSalario(){
        return qtdHora * valorHora;
    }

    public Integer getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(Integer qtdHora) {
        this.qtdHora = qtdHora;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return String.format("""
                             %s
                             Quantidade de horas trabalhadas: %d
                             Valor da hora: %.2f
                             """, super.toString(), 
                             qtdHora, 
                             valorHora);
    }
}
