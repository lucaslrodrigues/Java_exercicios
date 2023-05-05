/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.exercicio.relacionamento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lukas
 */
public class Carrinho {
    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList();
    }
    
    public Integer getQuantidade(){
        return produtos.size();
    }
    
    public void adicionar(Produto produto) {
        produtos.add(produto);
    }
    
    public Boolean existsPorNome(String nome) {
        Boolean exists = false;
        for (Produto produto : produtos){
            if (produto.getNome().equals(nome)) {
                exists = true;
            }
        }
        return exists;
    }
    
    public Integer getQuantidadePorCategoria(String nome) {
        Integer quantidade = 0;
        
        for (Produto produto : produtos) {
            if (produto.getCategoria().equals(nome)) {
                quantidade++;
            }
        }
        return quantidade;
    }
    
    public void limpar (){
        produtos.clear();
    }
    
    public void removerPorNome (String nome) {
        for (int i = 0; i < produtos.size(); i ++) {
            if (produtos.get(i).getNome().equals(nome)) {
                produtos.remove(i);
            }
        }
    }
    
    public Produto getPorNome(String nome) {
        Produto retorno = new Produto("null", "null",0.0);
        
        for (int i = 0; i < produtos.size(); i ++) {
            if (produtos.get(i).getNome().equals(nome)) {
                retorno = produtos.get(i);
            }
        }
        return retorno;
    }
    
    public Double getValorTotal () {
        Double total = 0.0;
        
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
}
