/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lucas.avaliacao.continuada1.lucas.de.lima;

import java.util.Scanner;

/**
 *
 * @author lukas
 */
public class LucasDeLima {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Boolean verify = true;
        
        Double saldo = 0.0;
        String bar = "\n----------------------------------\n";
        
        do {
            System.out.println(String.format("%s|    "
                    + "  SPtech Investimentos     |%s"
                    + "|  Olá, o que você deseja fazer: |%s"
                    + "|  1 - Depositar                 |\n"
                    + "|  2 - Sacar                     |\n"
                    + "|  3 - Simular rendimento        |\n"
                    + "|  0 - Sair                      |%s"
                    , bar,bar, bar, bar));
            
            Integer escolha = leitor.nextInt();
            
            switch (escolha){
                case 1:
                    System.out.println(String.format("%sDigite "
                            + "o valor a ser depositado:", bar));
                    Double valorDeposito = leitor.nextDouble();
                    
                    if (valorDeposito <= 0){
                        System.out.println("Valor inválido");
                    }else{
                        saldo += valorDeposito;
                        System.out.println("Deposito realizado");
                    }
                    break;
                case 2:
                    System.out.println(String.format("%sDigite "
                            + "o valor a ser sacado:", bar));
                    Double valorSacado = leitor.nextDouble();
                    
                    if (valorSacado <= 0){
                        System.out.println("Valor inválido");
                    }else{
                        if (saldo > 0 && saldo >= valorSacado) {
                            saldo -= valorSacado;
                        }
                    }
                    break;
                case 3:
                    if (saldo == 0) {
                        System.out.println("Saldo zerado, opição inválida");
                    }else{
                        System.out.println(String.format("|     "
                                + " Saldo atual: %.2f      |", saldo));

                        Double saldoTemp = saldo;
                        for (int i = 1; i <= 12; i++){
                            saldoTemp *= 1.1;
                            System.out.println(String.format("%s| Mês %d "
                                    + "| Saldo: %.2f      |%s", 
                                    bar, i,saldoTemp, bar));
                        }
                    }
                    break;
                case 0:
                    verify = false;
                    break;
                default:
                    System.out.println("Opição inválida");
            }
        } while(verify);
        
        
        
    }
}
