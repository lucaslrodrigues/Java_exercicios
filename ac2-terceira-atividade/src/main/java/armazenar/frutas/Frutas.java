/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package armazenar.frutas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lukas
 */
public class Frutas {

    public static void main(String[] args) {
        List<String> listaFrutas = new ArrayList();
        listaFrutas.add("uva");
        listaFrutas.add("maçã");
        listaFrutas.add("banana");
        listaFrutas.add("morango");
        
        System.out.println("Digite o nome de alguma fruta:");
        Scanner leitor = new Scanner(System.in);
        
        String fruta = leitor.nextLine();
//        Boolean verifica = true;;
//        
//        for (String f : listaFrutas) {
//            if (f.equalsIgnoreCase(fruta)){
//                System.out.println(String.format("A fruta %s existe na lista", fruta));
//                verifica = false;
//            }
//        }
//        
//        if (verifica) {
//            System.out.println(String.format("Não existe a fruta %s na lista", fruta));
//        }
        
        String texto = String.format("Não existe a fruta %s na lista", fruta);
        
        for (int i = 0; i < listaFrutas.size(); i++) {
            if (listaFrutas.get(i).equalsIgnoreCase(fruta)){
                texto = (String.format("A fruta %s existe na lista", fruta));
            }
        }
        
        System.out.println(texto);
    }
}
