/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.exercicio.figura;

/**
 *
 * @author lukas
 */
public class Circulo extends Figura{
    private Double raio;

    public Circulo(Double raio, String cor, Integer espessura) {
        super(cor, espessura);
        this.raio = raio;
    }
    
    @Override
    public Double calcularArea(){
        return Math.PI * (raio * raio);
    }

    @Override
    public String toString() {
        return "Circulo" + (super.toString()) + "\nraio: " + raio;
    }
}
