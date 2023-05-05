/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.cadastro.faculdade;

/**
 *
 * @author lukas
 */
public class Aluno {
    private String ra;
    private String nome;
    private Integer semestre;
    private boolean ativo;

    public Aluno(String ra, String nome, Integer semestre) {
        this.ra = ra;
        this.nome = nome;
        this.semestre = semestre;
        this.ativo = true;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return String.format("\n-----------------------------------\n"
                + "RA: %s\n"
                + "Nome: %s\n"
                + "Semestre: %d\n"
                + "Ativo: %s",
                ra,
                nome,
                semestre,
                (ativo ? "Ativo" : "Inativo"));
    }
    
    
}
