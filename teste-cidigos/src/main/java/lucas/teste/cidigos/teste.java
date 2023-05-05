/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.teste.cidigos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
/**
 *
 * @author lukas
 */
public class teste {
    public static void main(String[] args) {
        File arquivo = new File("teste.txt");
        long tamanho = 1024 * 1024 * 100; // 100 MB
        byte[] dados = new byte[(int) tamanho];
        new java.util.Random().nextBytes(dados); // gerando dados aleatórios

        try {
            // Medição de velocidade de escrita
            FileOutputStream out = new FileOutputStream(arquivo);
            FileChannel canal = out.getChannel();

            ByteBuffer buffer = ByteBuffer.wrap(dados);

            long inicio = System.nanoTime();

            canal.write(buffer);

            long fim = System.nanoTime();

            canal.close();
            out.close();

            double tempo = (fim - inicio) / 1_000_000_000.0; // em segundos
            double velocidadeEscrita = tamanho / tempo; // bytes por segundo

            System.out.println("Velocidade de escrita: " + velocidadeEscrita / (1024 * 1024) + " MB/s");

            // Medição de velocidade de leitura
            FileInputStream in = new FileInputStream(arquivo);
            canal = in.getChannel();

            inicio = System.nanoTime();

            buffer = ByteBuffer.allocate((int) tamanho);
            canal.read(buffer);

            fim = System.nanoTime();

            canal.close();
            in.close();

            tempo = (fim - inicio) / 1_000_000_000.0; // em segundos
            double velocidadeLeitura = tamanho / tempo; // bytes por segundo

            System.out.println("Velocidade de leitura: " + velocidadeLeitura / (1024 * 1024) + " MB/s");

            arquivo.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
