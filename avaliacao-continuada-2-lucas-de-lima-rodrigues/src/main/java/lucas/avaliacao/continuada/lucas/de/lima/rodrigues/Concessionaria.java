/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.avaliacao.continuada.lucas.de.lima.rodrigues;

/**
 *
 * @author lukas
 */
public class Concessionaria {
    private String nome;
    private Integer quantidadeVendas;
    private Integer quantidadeDescontosAplicados;
    private Double totalVendido;

    public Concessionaria(String nome) {
        this.nome = nome;
        this.quantidadeVendas = 0;
        this.quantidadeDescontosAplicados = 0;
        this.totalVendido = 0.0;
    }
    
   public void aumentarEstoque(Veiculo veiculo, Integer quantidade){
        Integer estoqueQtd = veiculo.getQuantidadeEstoque();
        if (estoqueQtd > 0) {
           veiculo.setQuantidadeEstoque(estoqueQtd + quantidade);
        } else {
           System.out.println("Não há nenhum veiculo no estoque");
        }
    }
   
   public void realizarVenda (Veiculo veiculo) {
       Integer veiculoQtd = veiculo.getQuantidadeEstoque();
        if (veiculoQtd > 0 && veiculo.getValorTabela() > 0) {
           veiculo.setQuantidadeEstoque(veiculoQtd - 1);
           quantidadeVendas ++;
           totalVendido += veiculo.getValorTabela();
        }
    }
   
   public void realizarVenda (Veiculo veiculo, Double porcentagemDesconto) {
       Integer veiculoQtd = veiculo.getQuantidadeEstoque();
       Double valorTabela = veiculo.getValorTabela();
       
       if (veiculoQtd > 0 && valorTabela > 0 && porcentagemDesconto > 0) {
           veiculo.setQuantidadeEstoque(veiculoQtd - 1);
           
           Double desconto = valorTabela * (porcentagemDesconto / 100);
           Double valorFinal = valorTabela - desconto;
           totalVendido += valorFinal;
           quantidadeVendas ++;
           quantidadeDescontosAplicados ++;
       } else {
           System.out.println("Dados invalidos");
       }
   }
   
   public Double getPercentualVendasComDesconto() {
       return (quantidadeDescontosAplicados * 100.0) / quantidadeVendas;
   }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public Integer getQuantidadeDescontosAplicados() {
        return quantidadeDescontosAplicados;
    }

    public Double getTotalVendido() {
        return totalVendido;
    }

    @Override
    public String toString() {
        return String.format("-------------------------------------------------\n"
                + "Concessionaria\nnome: %s\nquantidade vendas: "
                + "%d\nquantidade de descontos aplicados: %d\ntotal vendido: %.2f",
                nome, quantidadeVendas, quantidadeDescontosAplicados, totalVendido  );
    }
    
    
}
