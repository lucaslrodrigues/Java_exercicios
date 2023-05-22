/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.desafioclasseabstrata;

/**
 *
 * @author lukas
 */
public class App {
    public static void main(String[] args) {
        Heroi heroi1 = new Heroi("Homem Aranha", "Peter Parker");
        heroi1.acionarPoder("Sentido Aranha", 5);
        heroi1.acionarPoder("Super Força", 10);
        
        Heroi heroi2 = new Heroi("DeadPool", "Wade Wilson");
        heroi2.acionarPoder("Regeneração", 2);
        heroi2.acionarPoder("Tiro certeiro", 8);
        
        
        Vilao vilao1 = new Vilao("Ben Solo", "Kylo Rain");
        
        vilao1.acionarPoder("A força jedi", 11);
        vilao1.acionarPoder("Sabre de luz", 5);
        
        Vilao vilao2 = new Vilao("Loky", "Loki Laufeysson");
        vilao2.acionarPoder("Tele transporte", 7);
        vilao2.acionarPoder("Projeção Holografica", 5);
        
        Confronto confronto = new Confronto();
        confronto.lutar(heroi1, vilao1);
        confronto.lutar(heroi2, vilao2);
    }
}
