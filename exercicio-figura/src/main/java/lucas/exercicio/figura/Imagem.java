/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.exercicio.figura;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lukas
 */
public class Imagem {
    private List<Figura> figuras;

    public Imagem() {
        this.figuras = new ArrayList();
    }
    
    public void adicionarFigura(Figura f){
        figuras.add(f);
    }
    
    public void exibeFiguras(){
        System.out.println("\n======================== Figuras ===========================\n");
        for (Figura figura: figuras) {
            System.out.println(figura);
        }
    }
    
    public void exibeSomaArea(){
        System.out.println("\n===================== Soma da area =======================\n");
        Double total = 0.0;
        for (Figura figura: figuras){
            total+= figura.calcularArea();
        }
        System.out.println("A soma das areas é: "+ total);
    }
    
    public void exibeFiguraAreaMaior20(){
        System.out.println("\n=================== area maior que 20 =====================\n");
        for (Figura figura: figuras) {
            if (figura.calcularArea() > 20) {
                System.out.println(figura);
            }
        }
    }
    
    public void exibeQuadrado(){
        System.out.println("\n======================= Quadrados =========================\n");
        for (Figura figura: figuras){
            if (figura instanceof Quadrado) {
                System.out.println(figura);
            }
        }
    }

    @Override
    public String toString() {
        return "\n======================= Imagem ==========================\n"
                + "\n" + "figuras: " + figuras;
    }
}
