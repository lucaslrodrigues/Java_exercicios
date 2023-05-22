/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.atividade3.ac3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lukas
 */
public class EscolaVirtual {
    private String nome;
    private Integer vagas;
    private List<Professor> listaProf;

    public EscolaVirtual(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.listaProf = new ArrayList<>();
    }
    
    public void contratarProfessor(Professor prof){
        if (vagas > 0) {
            listaProf.add(prof);
            vagas--;
        }else{
            System.out.println(String.format(""
                    + "A escola virtual %s não possuí vagas disponíveis",
                    nome));
        }
    }
    
    public void exibitTodos () {
        if (!listaProf.isEmpty()) {
            System.out.println(listaProf);
        }else{
            System.out.println(String.format(""
                    + "A escola virtual %s não possui professores", 
                    nome));
        }
    }
    
    public void exibePalestrantes(){
        if (!listaProf.isEmpty()) {
            for (Professor professorDaVez: listaProf) {
                if (professorDaVez instanceof Palestrante) {
                    System.out.println(professorDaVez);
                }
            }            
        }else{
            System.out.println(String.format(""
                    + "A escola virtual %s não possui palestrantes",
                    nome));
        }
    }
    
    public void exibeFolhaDePagamento(){
        Double total = 0.0;
        for (Professor professorDaVez: listaProf) {
            System.out.println(String.format(""
                    + "Nome: %s\n"
                    + "Salario: %.2f",
                    professorDaVez.getNome(),
                    professorDaVez.calcularGanho()));
            total ++;
        }
        System.out.println(String.format(""
                + "Quantidade de funcionarios: %d\n"
                + "Total a ser pago: %.2f", listaProf.size(),
                total));
    }
    
    public void  atualizarValorCurso(String nomeCurso, Double valorNovo) {
        Boolean validador = true;
        for (Professor prof: listaProf) {
            if (prof.getCurso().equals(nomeCurso)) {
                prof.setValorCurso(valorNovo);
                validador = false;
            }
        }
        if (validador){
            System.out.println("Curso inexistente");
        }
    }
    
    public Professor buscaProfessor(String nome){
        for (Professor prof: listaProf) {
            if (prof.getNome().equals(nome)) {
                return prof;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("\n-------------------------------------------------\n"
                + "Nome: %s\n"
                + "Quantidade de vagas: %d\n"
                + "Professores: %s", 
                nome, 
                vagas, 
                listaProf);
    }
}
