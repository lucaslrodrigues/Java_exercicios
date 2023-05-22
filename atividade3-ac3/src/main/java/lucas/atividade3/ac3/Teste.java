/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.atividade3.ac3;

/**
 *
 * @author lukas
 */
public class Teste {
    public static void main(String[] args) {
        EscolaVirtual escola1 = new EscolaVirtual("Moodle", 2);
        
        Professor professor1 = new Professor("Lucas", "Analise de sistemas", 1600.00, 70);
        Palestrante palestrante1 = new Palestrante(20, 100.00, "Luiza", "Ciencia da computação", 2400.00, 70);
        Professor professor2 = new Professor("Matheus", "Sistemas da informação", 2400.00, 70);
        
        escola1.exibitTodos();
        escola1.exibePalestrantes();
        
        escola1.contratarProfessor(professor1);
        escola1.contratarProfessor(palestrante1);
        escola1.contratarProfessor(professor2);
        
        escola1.exibitTodos();
        
        System.out.println("=============== PALESTRANTES =================");
        escola1.exibePalestrantes();
        
        System.out.println("=================== FOLHA ====================");
        escola1.exibeFolhaDePagamento();
        
        escola1.atualizarValorCurso("Analise de sistemas", 1680.00);
        
        System.out.println("============ PROFESSOR PELO NOME ==============");
        System.out.println(escola1.buscaProfessor("Lucas"));
        
        System.out.println("============ INFORMAÇÕES DA ESCOLA ============");
        System.out.println(escola1);
    }
}
