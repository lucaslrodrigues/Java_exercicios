package com.br.wmn.data.tempo;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author consultor
 */
public class Time {
    public static void main(String[] args) {
        //Como instanciar
        LocalDateTime dataTime1 = LocalDateTime.now();
        LocalDateTime dataTime2 = LocalDateTime.of(2000, 05, 24, 13, 30, 20);
        LocalDateTime dataTime3 = LocalDateTime.of(2000, Month.JULY, 22, 13, 00, 00);
        LocalDateTime dataTime4 = LocalDateTime.parse("2000-01-01T00:00:00");
        
        //Como adicionar mais um dia ou horas
        LocalDateTime maisUmDia = dataTime1.plusDays(1);
        LocalDateTime menosUmDia = dataTime1.minusDays(1);
        LocalDateTime maisUmaHora = dataTime1.plusHours(24);
        LocalDateTime menosUmaHora = dataTime1.minusHours(24);
        LocalDateTime menosUmaSeg = dataTime1.minusSeconds(24);
        
        //Como validar se é depois ou antes
        Boolean isAntes = dataTime1.isBefore(dataTime3);
        Boolean isDepois = dataTime3.isAfter(dataTime1);
        
        //Como buscar data valor separado
        dataTime1.getDayOfMonth();
        dataTime1.getDayOfWeek();
        dataTime1.getDayOfYear();
        dataTime1.getMonth();
        dataTime1.getMonthValue();
        dataTime1.getYear();
        dataTime1.getHour();
        dataTime1.getMinute();
        dataTime1.getSecond();
        
        //Como formatar
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MMMMM/yyyy HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm:ss");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss");
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss:SS:nn");
        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm:ss");
        DateTimeFormatter formatter7 = DateTimeFormatter.ofPattern("d/M/y H:m:s");
        
        System.out.println(dataTime1.format(formatter7));
    }
}
