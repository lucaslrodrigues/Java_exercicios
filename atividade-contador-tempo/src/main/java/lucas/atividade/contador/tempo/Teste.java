/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.atividade.contador.tempo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lukas
 */
public class Teste {
    public static void main(String[] args) {
        ContadorTempo contador = new ContadorTempo();
        contador.iniciar();
        
        // Sem o sleep meu computador retornou zero por falta de precisão
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(contador.finalizar());
    }
}
