/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.atividade.kanbam;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author lukas
 */
public class Task {
    private String titulo;
    private LocalDateTime inicio;
    private LocalDateTime fim;

    public Task(String titulo) {
        this.titulo = titulo;
        this.inicio = LocalDateTime.now();
    }
    
    public void finalizarTask(){
        this.fim = LocalDateTime.now();
    }
    
    public Duration tempoDaTarefa(){
        Duration time = Duration.between(inicio, fim);
        return time;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }
}
