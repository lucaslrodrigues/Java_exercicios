/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.atividade.data.nascimento;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author lukas
 */
public class Pessoa {
    LocalDate dataNascimento;

    public Pessoa(String dataNascimento) {
        
        this.dataNascimento = LocalDate.parse(dataNascimento);
    }
    
    public Integer calcularIdade(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        LocalDate dataAtual = LocalDate.now();
        
        if (dataAtual.isAfter(dataNascimento)) {
        
            Integer nascAno = dataNascimento.getYear();
            Integer anoAtual = dataAtual.getYear();
            
            System.out.println();
            
            Integer idade = anoAtual - nascAno;
            return idade;
        }
        return null;
    }
}
