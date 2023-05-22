/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.atividade3.ac3;

/**
 *
 * @author lukas
 */
public class Palestrante extends Professor{
    private Integer qtdLive;
    private Double valorLive;

    public Palestrante(Integer qtdLive, Double valorLive, String nome, String curso, Double valorCurso, Integer qtdAlunos) {
        super(nome, curso, valorCurso, qtdAlunos);
        this.qtdLive = qtdLive;
        this.valorLive = valorLive;
    }

    @Override
    public Double calcularGanho() {
        return ((super.getValorCurso() * 0.05) * super.getQtdAlunos()) + (qtdLive * valorLive);
    }
    
    public Integer getQtdLive() {
        return qtdLive;
    }

    public void setQtdLive(Integer qtdLive) {
        this.qtdLive = qtdLive;
    }

    public Double getValorLive() {
        return valorLive;
    }

    public void setValorLive(Double valorLive) {
        this.valorLive = valorLive;
    }

    @Override
    public String toString() {
        return String.format("""
                             %s
                             Quantidade de Lives: %d
                             Valor Live: %.2f
                             """,
                             super.toString(),
                            qtdLive,
                            valorLive);
    }
}
