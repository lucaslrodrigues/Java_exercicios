/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correcao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lukas
 */
public class CarroTeste {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList();
        List<Carro> carrosAnoMaior2018 = new ArrayList();
        List<Carro> carrosValorMaior60000 = new ArrayList();
        List<Carro> carrosMesmaMarca = new ArrayList();
        
        Carro carro1 = new Carro("G5", 45000.00, 2015,"Volkswagen");
        listaCarros.add(carro1);
        Carro carro2 = new Carro("Gol bola", 28000.00, 2010,"Volkswagen");
        listaCarros.add(carro2);
        Carro carro3 = new Carro("Fiat Uno", 20000.00, 2007,"Fiat");
        listaCarros.add(carro3);
        Carro carro4 = new Carro("Ecosport", 85000.00, 2021,"Ford");
        listaCarros.add(carro4);
        Carro carro5 = new Carro("Santa fe", 162000.00, 2019,"Hyundai");
        listaCarros.add(carro5);
        
        // Mais pratico fazer
        // listaCarros.addAll(List.of(carro1, carro2, carro3, carro4, carro5));
        
        String barra = "--------------------------------------------------\n";
        
        System.out.println(String.format("%s|        Carros com ano maior que 2018:         |", barra));
        for (int i = 0; i < listaCarros.size(); i++) {
            if (listaCarros.get(i).getAno() > 2018){
                System.out.println(String.format("%s%s", barra, listaCarros.get(i)));
            }
        }
        
        System.out.println(String.format("%s|  Carros com o valor menor do que RS60.000,00   |", barra));
        for (Carro carro : listaCarros) {
            if (carro.getValor() < 60000.00) {
                System.out.println(String.format("%s%s",barra,carro));
            }
        }
        
        System.out.println(String.format("%s|         Carros com a marca Volkswagen          |", barra));
        for (Carro carro : listaCarros) {
            if (carro.getMarca().equals("Volkswagen"))
            System.out.println(String.format("%s%s", barra,carro));
        }
    }
}
