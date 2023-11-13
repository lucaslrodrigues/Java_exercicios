/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.teste.sprint;

import java.io.IOException;
import java.net.InetAddress;

/**
 *
 * @author lukas
 */
public class testeFernandes {
    public static void main(String[] args) {
        String host = "www.google.com";

        try {
            InetAddress inetAddress = InetAddress.getByName(host);

          System.out.println("Pinging " + host + " [" + inetAddress.getHostAddress() + "]");
          long startTime = System.currentTimeMillis();

          if (inetAddress.isReachable(5000)) {
            long endTime = System.currentTimeMillis();
            long timeTaken = endTime - startTime;
            System.out.println("Ping successful. Time taken: " + timeTaken + "ms");
          } else {
            System.out.println("Ping failed.");
          }
        } catch (IOException e) {
          System.out.println("Error occurred while pinging " + host + ": " + e.getMessage());
        }
    }
}
