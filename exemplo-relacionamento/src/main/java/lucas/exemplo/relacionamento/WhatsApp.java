/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.exemplo.relacionamento;

/**
 *
 * @author lukas
 */
public class WhatsApp {
    public static void main(String[] args) {
        Contato contato01 = new Contato("Bob", "(11)123");
        Contato contato02 = new Contato("João", "(11) 321");
        Contato contato03 = new Contato("Maria", "(11) 245");
        
        Grupo grupo01 = new Grupo("Trabalho");
        grupo01.adicionar(contato03);
        grupo01.adicionar(contato02);
        
        Grupo grupo02 = new Grupo("Amigos");
        grupo02.adicionar(contato01);
        
        System.out.println(grupo01);
        System.out.println(grupo02);
    }
}
