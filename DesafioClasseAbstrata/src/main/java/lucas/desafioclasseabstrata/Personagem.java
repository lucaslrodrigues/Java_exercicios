/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.desafioclasseabstrata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lukas
 */
public abstract class Personagem {
    protected String codinome;
    protected String nome;
    protected List<SuperPoder> poderes;

    public Personagem(String codinome, String nome) {
        this.codinome = codinome;
        this.nome = nome;
        this.poderes = new ArrayList();
    }
    
    public void acionarPoder(String nome, Integer categoria){
        SuperPoder novoPoder = new SuperPoder(nome, categoria);
        poderes.add(novoPoder);
    }
    
    public abstract Double getForcaTotal();

    public String getCodinome() {
        return codinome;
    }

    public String getNome() {
        return nome;
    }

    public List<SuperPoder> getPoderes() {
        return poderes;
    }

    @Override
    public String toString() {
        return String.format("""
                             --------------------------------------------------
                             Codinome: %s
                             Nome: %s
                             """, codinome, nome);
    }

    
}
