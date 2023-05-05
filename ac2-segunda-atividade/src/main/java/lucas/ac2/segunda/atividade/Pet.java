/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.ac2.segunda.atividade;

/**
 *
 * @author lukas
 */
public class Pet {
    private String nome;
    private String raca;
    private Integer qtdVisitasAoPetShop;
    private Double valorGastoEmPetShop;
    
    public Pet(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
        qtdVisitasAoPetShop = 0;
        valorGastoEmPetShop = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getQtdVisitasAoPetShop() {
        return qtdVisitasAoPetShop;
    }

    public void setQtdVisitasAoPetShop() {
        this.qtdVisitasAoPetShop += 1;
    }

    public Double getValorGastoEmPetShop() {
        return valorGastoEmPetShop;
    }

    public void setValorGastoEmPetShop(Double valorGastoEmPetShop) {
        this.valorGastoEmPetShop = valorGastoEmPetShop;
    }

    @Override
    public String toString() {
        return String.format("------------------------------------------------\n"
                + "Nome: %s"
                + "\nRaça: %s"
                + "\nQuantidade de visitas: %d"
                + "\nValor gasto em petshop: %.2f", 
                nome, raca, qtdVisitasAoPetShop, valorGastoEmPetShop);
    }
    
    
}
