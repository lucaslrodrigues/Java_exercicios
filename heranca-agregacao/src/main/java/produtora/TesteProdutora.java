/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtora;

import consultoria.*;

/**
 *
 * @author lukas
 */
public class TesteProdutora {
    public static void main(String[] args) {
        Produtora consult = new Produtora("sptechInc", 2);
        
        Ator devNull = new Ator(null, null, null);
        Ator dev1 = new Ator("Lucas", 40, 20.0);
        Protagonista dev2 = new Protagonista(40, 20.0, "Bea",40, 10.0);;
        Ator dev3 = new Ator("Felipy", 40, 20.0);
        
        consult.contratar(dev1);
        consult.contratar(dev2);
        consult.contratar(dev3);
        
        System.out.println("\n------ Existe por nome -----");
        System.out.println("null teste: " + consult.existePorNome("null"));
        System.out.println("Lucas: " + consult.existePorNome("Lucas"));
        System.out.println("Bea: " + consult.existePorNome("Bea"));
        System.out.println("Felipy: " + consult.existePorNome("Felipy"));
        
        System.out.println("\n------ Get quantidade de desenvolvedores -----");
        System.out.println(consult.getQuantidadeAtores());
        
        System.out.println("\n------ Get quantidade de desenvolvedores mobile -------");
        System.out.println(consult.getQuantidadeProtagonista());
        
        System.out.println("\n------ Get total de salarios ------");
        System.out.println(consult.getTotalSalarios());
        
        System.out.println("\n------ Buscar desenvolvedor por nome -----");
        System.out.println(consult.buscarAtorPorNome("Lucas"));
        System.out.println(consult.buscarAtorPorNome("Bea"));
        System.out.println("\nFelipy: " + consult.buscarAtorPorNome("Felipy"));
        
        System.out.println("\n--------- Consultoria --------\n" + consult);
    }
}
