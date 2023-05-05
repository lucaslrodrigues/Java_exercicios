/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.avaliacao.continuada.lucas.de.lima.rodrigues;

/**
 *
 * @author lukas
 */
public class Veiculo {
    private Integer id;
    private String modelo;
    private Double valorTabela;
    private Integer quantidadeEstoque;

    public Veiculo(Integer id, String modelo) {
        this.id = id;
        this.modelo = modelo;
        this.valorTabela = 0.0;
        this.quantidadeEstoque = 0;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getValorTabela() {
        return valorTabela;
    }

    public void setValorTabela(Double valorTabela) {
        this.valorTabela = valorTabela;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    @Override
    public String toString() {
        return String.format("-------------------------------------------------\n"
                + "Veiculo\nid: %d\nmodelo: %s\nvalor tabela: %.2f\nquantidade estoque: %d", id, modelo, valorTabela, quantidadeEstoque);
    }
    
}
