/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.exercicio.figura;

/**
 *
 * @author lukas
 */
public class Retangulo extends Figura{
    private Double base;
    private Double altura;

    public Retangulo(Double base, Double altura, String cor, Integer espessura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public Double calcularArea(){
        return base * altura;
    }

    @Override
    public String toString() {
        return "Retangulo" + (super.toString()) + "\nbase: " + base + "altura: " + altura;
    }
}
