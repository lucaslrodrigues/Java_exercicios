package lucas.ac2.segunda.atividade;

/**
 *
 * @author lukas
 */
public class Atividade {
    private String nomeAtividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;
    
    public Atividade(String nomeAtividade, String responsavel, Integer diasEstimados){
        if (diasEstimados > 0){
            this.nomeAtividade = nomeAtividade;
            this.responsavel = responsavel;
            this.diasEstimados = diasEstimados;
            this.diasUsados = 0;            
        } else {
            System.out.println("Dias estimados invalidos");
        }
    }
    
    public void terminarAtividade(Integer diasUsados){
        if (diasUsados > 0){
            this.diasUsados = diasUsados;
        } else {
            System.out.println("Dias invalidos");
        }
    }
    
    public void calcularTempo(){
        if(diasUsados > diasEstimados){
            System.out.println(String.format("Você estimou %d dias, mas a tarefa foi" +
            "feita em %d dias (%d dias a mais que o estimado). Melhore a estimativa.", 
                    diasEstimados, diasUsados, diasUsados - diasEstimados));
        } else if (diasUsados < diasEstimados){
            System.out.println(String.format("Você estimou %d " +
            "dias, e a tarefa foi feita em %d dias (%d dias a menos que o estimado)." +
            "Parabéns!", diasEstimados, diasUsados, diasEstimados - diasUsados));
        }else{
            System.out.println(String.format("Você estimou %d dias, "
                    + "e a tarefa foi feita em %d dias, atendendo a estimativa com precisão", 
                    diasEstimados, diasUsados));
        }
    }

    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    } 
    
    @Override
    public String toString() {
        return String.format("-------------------------------------------------\n"
                + "Atividade\nNome atividade: %s\nResponsavel: %s\n"
                + "Dias Estimados: %d\nDias Usados: %d", 
                nomeAtividade, responsavel, diasEstimados, diasUsados);
    }
    
    
}
