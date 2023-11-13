/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.exercicio.figura;

/**
 *
 * @author lukas
 */
public class App {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5.0, "Verde", 2);
        Retangulo retangulo = new Retangulo(2.3, 5.0, "Roxo", 2);
        Triangolo triangulo = new Triangolo(2.3, 5.0, "Azul", 2);
        Circulo circulo = new Circulo(5.0, "Laranja aperolado", 2);
        
        System.out.println(quadrado);
        System.out.println(quadrado.calcularArea());
        System.out.println(retangulo);
        System.out.println(retangulo.calcularArea());
        System.out.println(triangulo);
        System.out.println(triangulo.calcularArea());
        System.out.println(circulo);
        System.out.println(circulo.calcularArea());
        
        Imagem img = new Imagem();
        img.adicionarFigura(quadrado);
        img.adicionarFigura(retangulo);
        img.adicionarFigura(triangulo);
        img.adicionarFigura(circulo);
        
        img.exibeFiguras();
        img.exibeSomaArea();
        img.exibeQuadrado();
        img.exibeFiguraAreaMaior20();
        
        System.out.println(img);
    }
}
