/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtora;

import consultoria.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lukas
 */
public class Produtora {
    private String nome;
    private Integer vagas;
    private List<Ator> desenvolvedores;

    public Produtora(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        desenvolvedores = new ArrayList<>();
    }
    
    public Boolean existePorNome(String nome) {
        Boolean verificador = false;
        for (Ator dev: desenvolvedores) {
            if (dev.getNome().equalsIgnoreCase(nome)) {
                verificador = true;
            }
        }
        return verificador;
    }
    
    public void contratar (Ator d) {
        if (vagas > 0) {
            if (d != null) {
                desenvolvedores.add(d);
                vagas--;
            }
        } else {
            System.out.println("Sem vagas disponiveis!");
        }
    }
    
    public Integer getQuantidadeAtores(){
        return desenvolvedores.size();
    }
    
    public Integer getQuantidadeProtagonista() {
        Integer cont = 0;
        for (Ator dev: desenvolvedores) {
            if (dev instanceof Protagonista) {
                cont ++;
            }
        }
        return cont;
    }
    
    public Double getTotalSalarios(){
        Double total = 0.0;
        for (Ator dev: desenvolvedores) {
            total += dev.getSalario();
        }
        return total;
    }
    
    public Ator buscarAtorPorNome(String nome){
        for (Ator dev: desenvolvedores) {
            if (dev.getNome().equalsIgnoreCase(nome)) {
                return dev;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s"
                + "Quantidade de vagas: %d"
                + "%s", nome, vagas, desenvolvedores);
    }
    
    
}
