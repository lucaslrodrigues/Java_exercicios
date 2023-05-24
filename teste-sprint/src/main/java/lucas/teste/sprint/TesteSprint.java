/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lucas.teste.sprint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author lukas
 */
public class TesteSprint {

    public static void main(String[] args) throws InterruptedException, IOException {
        while (true) {
            ProcessBuilder processBuilder = new ProcessBuilder("ping=$(ping -c 4 www.google.com | tail -l | awk -F'/' '{print $5}')");
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            String valorPing = System.getenv("ping");
            System.out.println(valorPing);
            Thread.sleep(30000);
        }

    }
}
