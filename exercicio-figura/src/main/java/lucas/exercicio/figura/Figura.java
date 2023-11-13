/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.exercicio.figura;

/**
 *
 * @author lukas
 */
public abstract class Figura {
    protected String cor;
    protected Integer espessura;

    public Figura(String cor, Integer espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }
    
    public abstract Double calcularArea();

    @Override
    public String toString() {
        return "\n===========================================================\n"
                + "cor: " + cor + "espessura: " + espessura;
    }
}
