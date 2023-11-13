/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.atividade.contador.tempo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author lukas
 */
public class ContadorTempo {
    private LocalDateTime start;

    public ContadorTempo() {
        this.start = null;
    }
    
    public void iniciar(){
        this.start = LocalDateTime.now();
    }
    
    public Duration finalizar(){
        LocalDateTime end = LocalDateTime.now();
        System.out.println(start);
        System.out.println(end);

        Duration d = Duration.between(start, end);

        System.out.println("Nanosegundos: " + d.getNano());
        System.out.println("Milisegundos: " + d.toMillis());
        System.out.println("Segundos: " + d.toSeconds());
        System.out.println("Minutos: " + d.toMinutes());
        return d;
    }
    
    public void outroFinalizar(){
        LocalDateTime end = LocalDateTime.now();
        
        Long startSeconds = Long.valueOf(start.getHour() / 3600) + Long.valueOf(start.getMinute() / 60) + Long.valueOf(start.getSecond());
        Long endSeconds = Long.valueOf(end.getHour() / 3600) + Long.valueOf(end.getMinute() / 60) + Long.valueOf(end.getSecond());
        System.out.println(String.format("%.10f", endSeconds - startSeconds));
    }
}
