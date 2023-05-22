/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.atividade3.ac3;

/**
 *
 * @author lukas
 */
public class Professor {
    private String nome;
    private String curso;
    private Double valorCurso;
    private Integer qtdAlunos;

    public Professor(String nome, String curso, Double valorCurso, Integer qtdAlunos) {
        this.nome = nome;
        this.curso = curso;
        this.valorCurso = valorCurso;
        this.qtdAlunos = qtdAlunos;
    }
    
    public Double calcularGanho() {
        return (valorCurso * 0.05) * qtdAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getValorCurso() {
        return valorCurso;
    }

    public void setValorCurso(Double valorCurso) {
        this.valorCurso = valorCurso;
    }

    public Integer getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(Integer qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    @Override
    public String toString() {
        return String.format("""
                             \n---------------------------------------------------
                             Nome: %s
                             Curso: %s
                             Valor do curso: %.2f
                             Quantidade de alunos: %d
                             """, 
                            nome,
                            curso,
                            valorCurso,
                            qtdAlunos);
    }
}
