/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cli.app.sprint;

import java.util.Scanner;

/**
 *
 * @author lukas
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Você precisa realizar login para utilizar o serviço\n"
                + "Informe o login e senha\n\nLogin:");
        String loginRecebido = readLine(reader);
        System.out.println("Senha:");
        String senhaRecebido = readLine(reader);
        
        Login loginClasse = new Login(loginRecebido, senhaRecebido);
        loginClasse.logar();
    }
    
    private static String readLine(BufferedReader reader) {
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
