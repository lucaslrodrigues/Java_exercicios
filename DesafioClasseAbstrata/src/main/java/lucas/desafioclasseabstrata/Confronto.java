/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.desafioclasseabstrata;

/**
 *
 * @author lukas
 */
public class Confronto {
    public Confronto() {
    }
    
    public void lutar(Heroi heroi, Vilao vilao){
        Double forcaHeroi = heroi.getForcaTotal();
        Double forcaVilao = vilao.getForcaTotal();
        
        if (forcaHeroi > forcaVilao) {
            System.out.println(String.format(""
                    + "%s é o vencedor com %.2f de força a mais", 
                    heroi.getCodinome(), 
                    forcaHeroi - forcaVilao));
        } else if (forcaHeroi < forcaVilao) {
            System.out.println(String.format(""
                    + "%s é o vencedor com %.2f de força a mais", 
                    heroi.getCodinome(), 
                    forcaVilao - forcaHeroi));
        }else{
            System.out.println(String.format(""
                    + "%s e %s empataram com %.2f de força", 
                        heroi.getNome(),
                        vilao.getNome(),
                    forcaHeroi));
        }
    }
}
