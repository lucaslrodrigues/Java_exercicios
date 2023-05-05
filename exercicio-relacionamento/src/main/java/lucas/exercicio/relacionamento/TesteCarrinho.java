/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.exercicio.relacionamento;

/**
 *
 * @author lukas
 */
public class TesteCarrinho {

    public static void main(String[] args) {
        Produto produto1 = new Produto("Garrafa", "Utensilios", 20.0);
        Produto produto2 = new Produto("Tesoura", "Material escolar", 3.0);
        Produto produto3 = new Produto("Caneta", "Material escolar", 2.0);

        Carrinho carrinho = new Carrinho("Alguém");
        carrinho.adicionar(produto1);
        carrinho.adicionar(produto2);
        carrinho.adicionar(produto3);
        Integer qtdEncontrada=
                carrinho.getQuantidadePorCategoria("Material escolar");

//        System.out.println(carrinho.getQuantidade());
        System.out.println(carrinho);
    }
}
