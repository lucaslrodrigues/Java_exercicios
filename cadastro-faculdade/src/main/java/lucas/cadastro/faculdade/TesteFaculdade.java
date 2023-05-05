/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.cadastro.faculdade;

/**
 *
 * @author lukas
 */
public class TesteFaculdade {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("01222999","Lucas", 2);
        Aluno aluno2 = new Aluno("01222000","Donnie", 1);
        Aluno aluno3 = new Aluno("01222555","Darko", 2);
        
        Faculdade faculdade1 = new Faculdade("Sptech");
        
        faculdade1.matricularAluno(aluno1);
        faculdade1.matricularAluno(aluno2);
        faculdade1.matricularAluno(aluno3);
        
        System.out.println(faculdade1);
        
        System.out.println("\nAlunos");
        faculdade1.exibirAlunos();
        faculdade1.cancelarMatricula("01222555");
        System.out.println("\nAlunos cancelados");
        faculdade1.exibirCancelados();
        System.out.println("\nPor semestre");
        faculdade1.exibirAlunosPorSemestre(2);
    }
}
