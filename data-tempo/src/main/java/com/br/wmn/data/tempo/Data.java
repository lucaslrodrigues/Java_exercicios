package com.br.wmn.data.tempo;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author consultor
 */
public class Data {

    public static void main(String[] args) {
        //Como instanciar
        LocalDate data1 = LocalDate.now();
        LocalDate data2 = LocalDate.of(2000, 5, 22);
        LocalDate data3 = LocalDate.of(2000, Month.JULY, 22);
        LocalDate date4 = LocalDate.parse("2000-05-22");

        //Como validar se é bicesto
        Boolean isAnoBicesto = data3.isLeapYear();
        
        //Como validar se é depois ou antes
        Boolean isDepois = data1.isAfter(data3);
        Boolean isAntes = data3.isBefore(data1);
        
        //Como validar se é depois ou antes
        data1.getDayOfMonth();
        data1.getDayOfWeek();
        data1.getDayOfYear();
        data1.getMonth();
        data1.getMonthValue();
        data1.getYear();
        
        //Como adicionar mais um dia ou horas
        LocalDate maisUmDia = data1.plusDays(1);
        LocalDate menosUmDia = data1.minusDays(1);

        //Como formatar
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MMMMM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        DateTimeFormatter formatter7 = DateTimeFormatter.ofPattern("d/M/y");
        
        System.out.println(data1.format(formatter1));
    }
}
