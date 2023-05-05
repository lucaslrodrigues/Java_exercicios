/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.exemplo.relacionamento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lukas
 */
public class Grupo {
    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList();
    }
    
    public void adicionar(Contato c){
        contatos.add(c);
    }
    
    public void remover(Contato c) {
        
    }

    @Override
    public String toString() {
        return String.format("\n----------------------------------------\n"
                + "Grupo: %s\n"
                + "Contatos: %s",nome, contatos);
    }
    
}
