/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.exercicio.figura;

/**
 *
 * @author lukas
 */
public class Quadrado extends Figura {
    private Double lado;

    public Quadrado(Double lado, String cor, Integer espessura) {
        super(cor, espessura);
        this.lado = lado;
    }
    
    @Override
    public Double calcularArea(){
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Quadrado" + (super.toString()) + "\nlado: " + lado;
    }
}
