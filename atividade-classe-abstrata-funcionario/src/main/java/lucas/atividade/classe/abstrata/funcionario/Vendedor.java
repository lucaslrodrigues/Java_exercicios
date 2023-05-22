/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.atividade.classe.abstrata.funcionario;

/**
 *
 * @author lukas
 */
public class Vendedor extends Funcionario{
    private Double vendas;
    private Double taxa;

    public Vendedor(Double vendas, Double taxa, String cpf, String nome) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }
    
    @Override
    public Double calcularSalario(){
        return vendas * (taxa / 100);
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        return String.format("""
                             %s
                             Vendas: %.2f
                             Taxa: %.2f
                             """, super.toString(), vendas, taxa);    
    }
    
    
}
