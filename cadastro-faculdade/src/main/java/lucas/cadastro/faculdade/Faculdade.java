/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.cadastro.faculdade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lukas
 */
public class Faculdade {
    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        alunos = new ArrayList();
    }
    
    public void matricularAluno (Aluno aluno) {
        alunos.add(aluno);
    }
    
    public void cancelarMatricula (String ra) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getRa().equals(ra)){
                alunos.get(i).setAtivo(false);
            }
        }
    }
    
    public void exibirAlunos () {
        System.out.println(alunos);
    }
    
    public void exibirAlunosPorSemestre (Integer semestre) {
        for (int i = 0; i < alunos.size(); i++) {
           if(alunos.get(i).getSemestre().equals(semestre)){
               System.out.println(alunos.get(i));
           }
        }
    }
    
    public void exibirCancelados(){
        for (Aluno aluno : alunos){
            if (!aluno.isAtivo()){
                System.out.println(aluno);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return String.format("---------------------------------------\n"
                + "Nome faculdade: %s\n"
                + "Alunos: %s", 
                nome, 
                alunos);
    }
    
    
}
