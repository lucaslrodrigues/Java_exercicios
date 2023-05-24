/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author lukas
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Thread.sleep(10000);
        String fileName = "my_env.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String login = reader.readLine();
            String password = reader.readLine();

            // Utilize as variáveis como desejado
            
            ProcessBuilder processBuilder = new ProcessBuilder("rm", fileName);
            Process process = processBuilder.start();
            int exitCode = process.waitFor();

            System.out.println("Email: " + login);
            System.out.println("Password: " + password);
            
//            while (true) {
//                Thread.sleep(10000);
//                System.out.println("Dormindo...");
//            }

            Login loginClasse = new Login(login, password);
            loginClasse.logar();
            
            
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivos do diretorio /app");
            LogGenerator.generateLogErro("Erro ao ler usuário");
        }
        

    }
}
