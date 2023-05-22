/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.desafioclasseabstrata;

import java.util.List;

/**
 *
 * @author lukas
 */
public class Vilao extends Personagem{

    public Vilao(String codinome, String nome) {
        super(codinome, nome);
    }

    @Override
    public Double getForcaTotal() {
        Integer totalPoder = 0;
        for (SuperPoder poder: super.poderes) {
            totalPoder += poder.getCategoria();
        }
        return totalPoder * 1.0;
    }
    
}