/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.gerenciamento.de.vendas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lukas
 */
public class Teste {
    public static void main(String[] args) {
        List<Medicamento> listaMedicamento = new ArrayList();
        Scanner input = new Scanner(System.in);
        Integer numDigitado;
        
        do{
            System.out.println("1 - Cadastrar medicamento\n"
                    + "2 - Exibir medicamento\n"
                    + "3 - Buscar medicamento por nome\n"
                    + "4 - sair");
            numDigitado = input.nextInt();

            switch (numDigitado) {
                case 1:
                    input.nextLine();
                    System.out.println("Nome medicamento");
                    String nomeMedicamento = input.nextLine();

                    System.out.println("Quantidade medicamento");
                    Integer quantidadeMedicamento = input.nextInt();

                    System.out.println("Valor de venda");
                    Double valorVenda = input.nextDouble();

                    Medicamento medicamento = 
                            new Medicamento(listaMedicamento.size(), nomeMedicamento, quantidadeMedicamento, valorVenda);
                    listaMedicamento.add(medicamento);
                    break;
                case 2:
                    if (listaMedicamento.size() == 0) {
                        System.out.println("Não existem medicamentos salvos");
                        break;
                    }
                    for (int i = 0; i < listaMedicamento.size(); i++) {
                        System.out.println(listaMedicamento.get(i));
                    }
                    break;

                case 3:
                    if (listaMedicamento.size() == 0) {
                        System.out.println("Não existem medicamentos salvos");
                        break;
                    }
                    input.nextLine();
                    System.out.println("Digite o nome do medicamento:");
                    String nomeMedicamentoBusca = input.nextLine();
                    
                    Boolean verificaNome = true;
                    for (int i = 0; i < listaMedicamento.size(); i++) {
                        if (listaMedicamento.get(i).getNomeMedicamento().equals(nomeMedicamentoBusca)){
                            System.out.println(listaMedicamento.get(i));
                            verificaNome = false;
                        }
                    }
                    if (verificaNome) {
                        System.out.println("Medicamento não cadastrado!");
                    }
                    break;

                case 4:
                    System.out.println("Até a proxima");
                    break;

                default:
                    System.out.println("Opição invalida");
            }
        }while (numDigitado != 4);
    }
}
