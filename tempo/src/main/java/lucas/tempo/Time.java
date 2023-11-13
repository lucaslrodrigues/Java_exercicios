/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.tempo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author lukas
 */
public class Time {
    public static void main(String[] args) {
        LocalDateTime dataTime1 = LocalDateTime.now();
        LocalDateTime dataTime2 = LocalDateTime.of(2000, 05,24,13,30,20);
        LocalDateTime dataTime3 = LocalDateTime.parse("2000-05-24T13:30:10");
        LocalDateTime dataTime4 = LocalDateTime.parse("2000-01-01T13:30:10");
        
        System.out.println(dataTime3);
        
        System.out.println(dataTime3.minusDays(1)); // Menos dias
        System.out.println(dataTime3.plusDays(1)); // Mais dias
        System.out.println(dataTime4.minusDays(1));
        
        Boolean isAntes = dataTime1.isBefore(dataTime3);
        Boolean isDepois = dataTime1.isAfter(dataTime3);
        
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm:ss");
        
        System.out.println(dataTime1.format(formatter));
    }
}
