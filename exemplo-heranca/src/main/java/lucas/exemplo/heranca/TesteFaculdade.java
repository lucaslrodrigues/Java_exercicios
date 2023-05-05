/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.exemplo.heranca;

/**
 *
 * @author lukas
 */
public class TesteFaculdade {
    public static void main(String[] args) {
        // Criando somente um aluno
        Aluno alunoComum = new Aluno("123","Lucas", 9.5, 8.9);
        AlunoPosGraduacao alunoPos = new AlunoPosGraduacao(9.2, 5.4, "234", "Mega", 9.0, 9.5);
        
        System.out.println("Media aluno comum: " + alunoComum.calcularMedia());
        System.out.println("Nota Aluno pós: " + alunoPos.calcularMedia());
        
        System.out.println(alunoComum);
        System.out.println("-----------------------------------------");
        System.out.println(alunoPos);
    }
}
