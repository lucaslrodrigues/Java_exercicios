/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.teste.sprint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author lukas
 */
public class TesteTry {
    public static void main(String[] args) throws InterruptedException {
        String fileName = "config.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            ProcessBuilder processBuilder = new ProcessBuilder("rm", fileName);
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivos do diretorio /app");
        }
        
        System.out.println("Passou do try");
    }
}
