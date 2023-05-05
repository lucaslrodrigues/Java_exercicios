/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.exemplo.heranca;

/**
 *
 * @author lukas
 */
public class Aluno {
    protected String ra;
    protected String nome;
    protected Double nota1;
    protected Double nota2;

    public Aluno(String ra, String nome, Double nota1, Double nota2) {
        this.ra = ra;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public Double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return String.format("RA: %s"
                + "\nNome: %s"
                + "\nNota 01: %.1f"
                + "\nNota 02: %.1f",
                ra,
                nome,
                nota1,
                nota2);
    }
    
}
