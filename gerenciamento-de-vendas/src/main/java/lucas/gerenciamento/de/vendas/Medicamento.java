package lucas.gerenciamento.de.vendas;

/**
 *
 * @author lukas
 */
public class Medicamento {
    private Integer id = 1;
    private String nomeMedicamento;
    private Integer quantidadeEstoque;
    private Double valorVenda;

    public Medicamento(Integer id, String nomeMedicamento, Integer quantidadeEstoque, Double valorVenda) {
        this.id = id;
        this.nomeMedicamento = nomeMedicamento;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valorVenda = valorVenda;
    }

    public Integer getId() {
        return id;
    }

    public String getNomeMedicamento() {
        return nomeMedicamento;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return String.format("---------------------------------------------------\n"
                + "ID: %d\nNome: %s\nQuantidade de estoque: %d\nValor: R$%.2f\n", 
                id, nomeMedicamento, quantidadeEstoque, valorVenda);
    }
    
    
}
