/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.felipy_hospital;

/**
 *
 * @author lukas
 */
public class Laudo {
    private String nomePaciente;
    private Integer idadePaciente;
    private String nomeMedico;
    private String tipoProcedimento;
    private String descricaoProcedimento;
    private Boolean procedimentoConcluiuNormalidade;

    public Laudo(String nomePaciente, Integer idadePaciente, String nomeMedico, String tipoProcedimento, String descricaoDoProcedimento, Boolean procedimentoConcluiuNormalidade) {
        this.nomePaciente = nomePaciente;
        this.idadePaciente = idadePaciente;
        this.nomeMedico = nomeMedico;
        this.tipoProcedimento = tipoProcedimento;
        this.descricaoProcedimento = descricaoDoProcedimento;
        this.procedimentoConcluiuNormalidade = procedimentoConcluiuNormalidade;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public Integer getIdadePaciente() {
        return idadePaciente;
    }

    public void setIdadePaciente(Integer idadePaciente) {
        this.idadePaciente = idadePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getTipoProcedimento() {
        return tipoProcedimento;
    }

    public void setTipoProcedimento(String tipoProcedimento) {
        this.tipoProcedimento = tipoProcedimento;
    }

    public String getDescricaoProcedimento() {
        return descricaoProcedimento;
    }

    public void setDescricaoProcedimento(String descricaoProcedimento) {
        this.descricaoProcedimento = descricaoProcedimento;
    }

    public Boolean getProcedimentoConcluiuNormalidade() {
        return procedimentoConcluiuNormalidade;
    }

    public void setProcedimentoConcluiuNormalidade(Boolean procedimentoConcluiuNormalidade) {
        this.procedimentoConcluiuNormalidade = procedimentoConcluiuNormalidade;
    }

    @Override
    public String toString() {
        return String.format("""
                             --------------------------------------------------
                             Laudo
                             Paciente: %s
                             Idade: %s
                             Procedimento realizado: %s
                             Descrição: %s
                             Quadro de normalidade: %s
                             
                             
                                                                ass: %s
                             """, nomePaciente,
                             idadePaciente, 
                             tipoProcedimento, 
                             descricaoProcedimento,
                             (procedimentoConcluiuNormalidade ? "Sim" : "Não"),
                             nomeMedico
                             );
    }
    
    
}
