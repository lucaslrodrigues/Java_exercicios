/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.desafioclasseabstrata;

/**
 *
 * @author lukas
 */
public class SuperPoder {
    private String nome;
    private Integer categoria;

    public SuperPoder(String nome, Integer categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return String.format("""
                             Nome: %s
                             Categoria: %s
                             """, nome, categoria);
    }
    
}
