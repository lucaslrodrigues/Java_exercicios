/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correcao;


/**
 *
 * @author lukas
 */
public class Carro {
    private String modelo;
    private Double valor;
    private Integer ano;
    private String marca;
    
    public Carro(String modelo, Double valor, Integer ano, String marca){ // Construtor não tem void
        this.modelo = modelo;
        this.valor = valor;
        this.ano = ano;
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return String.format("Modelo: %s\nValor: %.2f\nAno: %d\nMarca: %s", modelo, valor, ano, marca) ;
    }
}
