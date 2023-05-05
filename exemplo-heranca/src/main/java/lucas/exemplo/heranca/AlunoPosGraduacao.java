/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.exemplo.heranca;

/**
 *
 * @author lukas
 */
public class AlunoPosGraduacao extends Aluno{
    private Double notaArtigo;
    private Double notaTcc;

    public AlunoPosGraduacao(Double notaArtigo, Double notaTcc, String ra, String nome, Double nota1, Double nota2) {
        super(ra, nome, nota1, nota2);
        this.notaArtigo = notaArtigo;
        this.notaTcc = notaTcc;
    }

    @Override
    public Double calcularMedia() {
        return (super.nota1 +
                super.nota2 +
                this.notaArtigo +
                this.notaTcc) / 4.0;
    }
//    Ou
//    public Double calcularMedia() {
//        return (super.calcularMedia() +
//                this.notaArtigo +
//                this.notaTcc) / 4;
//    }
    
    
    
    public Double getNotaArtigo() {
        return notaArtigo;
    }

    public void setNotaArtigo(Double notaArtigo) {
        this.notaArtigo = notaArtigo;
    }

    public Double getNotaTcc() {
        return notaTcc;
    }

    public void setNotaTcc(Double notaTcc) {
        this.notaTcc = notaTcc;
    }

    @Override
    public String toString() {
        return String.format("%s"
                + "\nNota Artigo: %.1f"
                + "\nNota TCC: %.1f"
                + "\nMédia: %.1f",
                super.toString(),
                notaArtigo,
                notaTcc,
                this.calcularMedia());
    }
    
    
}