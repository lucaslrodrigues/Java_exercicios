/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.tempo;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author lukas
 */
public class Data {
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.now();
        LocalDate data2 = LocalDate.of(2023, 5, 22);
        LocalDate data3 = LocalDate.parse("2023-05-24");
        
        System.out.println(data3.isLeapYear());
        System.out.println(data1.isAfter(data3));
        
        Boolean eBisexto = data3.isLeapYear();
        
//        Boolean data1DiaDoAno = data1.getDayOfYear(); // Este metodo vale para dia e mês também
        
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.forLanguageTag("pt-br"));
        
        System.out.println(data1.format(formatador));
        
//        System.out.println(data1);;
    }
}
