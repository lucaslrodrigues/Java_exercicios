/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultoria;

/**
 *
 * @author lukas
 */
public class DesenvolvedorMobile extends Desenvolvedor{
    private Integer qtdHoraTrabalhadasMobile;
    private Double valorHoraTrabalhadaMobile;

    public DesenvolvedorMobile(Integer qtdHoraTrabalhadasMobile, Double valorHoraTrabalhadaMobile, String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHoraTrabalhadasMobile = qtdHoraTrabalhadasMobile;
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }
    
    @Override
    public Double getSalario() {
        return (qtdHoraTrabalhadasMobile * valorHoraTrabalhadaMobile) + super.getSalario();
    }

    public Integer getQtdHoraTrabalhadasMobile() {
        return qtdHoraTrabalhadasMobile;
    }

    public void setQtdHoraTrabalhadasMobile(Integer qtdHoraTrabalhadasMobile) {
        this.qtdHoraTrabalhadasMobile = qtdHoraTrabalhadasMobile;
    }

    public Double getValorHoraTrabalhadaMobile() {
        return valorHoraTrabalhadaMobile;
    }

    public void setValorHoraTrabalhadaMobile(Double valorHoraTrabalhadaMobile) {
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }

    @Override
    public String toString() {
        return String.format("%s"
                + "\nqtdHoraTrabalhadasMobile: %d"
                + "\nvalorHoraTrabalhadaMobile: R$%.2f",
                super.toString(),
                qtdHoraTrabalhadasMobile,
                valorHoraTrabalhadaMobile);
    }
    
    
}
