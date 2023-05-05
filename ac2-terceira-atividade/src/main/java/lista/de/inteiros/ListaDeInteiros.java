/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.de.inteiros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lukas
 */
public class ListaDeInteiros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> listaInteiros = new ArrayList();
        
        while (true){
            System.out.println("Digite um número inteiro (quando quiser parar digite \"0\")");
            Integer numDigitado = leitor.nextInt();
            
            if (numDigitado.equals(0)){
                break; 
            }else{
                listaInteiros.add(numDigitado);
            }
        }
        String barra = "-----------------------------------------";
        System.out.println(String.format("%s\nPares:", barra));
        for (Integer inteiro : listaInteiros) {
            if (inteiro % 2 == 0){
                System.out.println(inteiro);
            }
        }
        
        System.out.println(String.format("%s\nImpares:", barra));
        for (Integer inteiro : listaInteiros) {
            if (inteiro % 2 != 0){
                System.out.println(inteiro);
            }
        }
        
        Integer totalInteiros = 0;
        for (Integer inteiro : listaInteiros) {
            totalInteiros += inteiro;
        }

        System.out.println(String.format("%s\nSoma total: %d", barra, totalInteiros));
        
        Integer menor = Integer.MAX_VALUE;
        Integer maior = Integer.MIN_VALUE;
        
        for (Integer inteiro : listaInteiros) {
            if (inteiro < menor){
                menor = inteiro;
            }
            
            if (inteiro > maior){
                maior = inteiro;
            }
        }
        
        System.out.println(String.format("%s\nMaior: %d\nMenor: %d",barra,maior, menor));
    }
}
