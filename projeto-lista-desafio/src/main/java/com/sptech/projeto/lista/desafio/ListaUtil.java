package com.sptech.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;

public class ListaUtil {
    
    private List<Integer> inteiros;

    public ListaUtil() {
        inteiros = new ArrayList();
    }

    public Integer count() {
        return inteiros.size();
    }
    
    public void add(Integer valor) {
        if (valor != null){
            inteiros.add(valor);
        }
    }

    public void remove(Integer valor) {
        if (valor != null){
            for (int i = 0; i < inteiros.size(); i++) {
                if (inteiros.get(i).equals(valor)){
                    inteiros.remove(i);
                }
            }
        }
    }

    public Integer countPares() {
        Integer qtd = 0;
        for (Integer inteiro: inteiros){
            if (inteiro % 2 == 0){
                qtd++;
            }
        }
        return qtd;
    }

    public Integer countImpares() {
        Integer qtd = 0;
        for (Integer inteiro: inteiros){
            if (inteiro % 2 != 0){
                qtd++;
            }
        }
        return qtd;
    }

    public Integer somar() {
//        Integer qtd = 0;
        Integer soma = 0;
        
        for (int i = 0; i < inteiros.size(); i++) {
            soma += inteiros.get(i);
        }
        
        return soma;   
    }

    public Integer getMaior() {
        Integer maior = Integer.MIN_VALUE;
        if (inteiros.isEmpty()){
            return 0;
        }
        
        for (Integer inteiro: inteiros) {
            if (inteiro > maior) {
                maior = inteiro;
            }
        }
        return maior;
    }

    public Integer getMenor() {
        Integer menor = Integer.MAX_VALUE;        
        if (inteiros.isEmpty()){
            return 0;
        }
        
        for (Integer inteiro: inteiros) {
            if (inteiro < menor) {
                menor = inteiro;
            }
        }
        return menor;
    }

    public Boolean hasDuplicidade() {
        List<Integer> listaPares = new ArrayList();
        
        Boolean isSaved = false;
        for (int i = 0; i < inteiros.size(); i++) {
            Integer par = 0;
            for (Integer inteiro: inteiros){
                if (inteiro.equals(inteiros.get(i))) {
                    par += 1;
                }
                if (par > 1) {
                    return isSaved = true;
                }
            }
        }
        return isSaved;
    }
}
