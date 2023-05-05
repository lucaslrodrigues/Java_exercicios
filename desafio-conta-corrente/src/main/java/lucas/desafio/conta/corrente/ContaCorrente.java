/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.desafio.conta.corrente;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lukas
 */
public class ContaCorrente {
    private String titular;
    private Double saldo;
    private List<Historico> historicos;

    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.historicos = new ArrayList();
    }
    
    public void depositar (Double valor, Integer dia, Integer mes, Integer ano){
        if (valor > 0 && dia > 0 && dia <= 31 && mes > 0 && mes <= 12 && ano <= LocalDate.now().getYear()){
            Historico newHistorico = new Historico(dia, mes, ano, valor, "Deposito");
            historicos.add(newHistorico);
            saldo += valor;
        }
    }
    
    public void sacar (Double valor, Integer dia, Integer mes, Integer ano) {
        if (saldo >= valor){
            if (dia > 0 && dia <= 31 && mes > 0 && mes <= 12 && ano <= LocalDate.now().getYear()) {
                saldo -= valor;
                Historico newHistorico = new Historico(dia, mes, ano, valor, "Saque");
                historicos.add(newHistorico);
            }
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void exibirExtrato () {
        for (Historico historico : historicos) {
            System.out.println(historico);
        }
        /*
        ou
        System.out.println(this);
        ou
        System.out.println(historicos);
        */
    }

    @Override
    public String toString() {
        return String.format("""
                            Conta corrente
                            Titular: %s
                            Saldo: %.2f
                            Historicos: %s
                             """, titular, saldo, historicos);
    }
    
    
}
