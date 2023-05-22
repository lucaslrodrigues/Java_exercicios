/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.felipy_hospital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lukas
 */
public class Medico extends Funcionario{
    private String crm;
    private String especialidade;
    private List<Plantao> plantoes;
    private List<Laudo> laudos;

    public Medico(String crm, String especialidade, String nome, Double salario) {
        super(nome, salario);
        this.crm = crm;
        this.especialidade = especialidade;
        this.plantoes = new ArrayList();
    }
    
    @Override
    public Double getSalario(){
        return super.getSalario() + (plantoes.size() * 100.00); 
    }
    
    public void consultar(){
        System.out.println("Realizar consulta");
    }
    
    public void desenvolverLaudo(String nomePaciente, Integer idadePaciente, String nomeMedico, String tipoProcedimento, String descricaoDoProcedimento, Boolean procedimentoConcluiuNormalidade){
        Laudo laudo = new Laudo(nomePaciente, idadePaciente, nomeMedico, tipoProcedimento, descricaoDoProcedimento, procedimentoConcluiuNormalidade);
        laudos.add(laudo);
    }
    
    public void realizarPlantao(){
        Integer dia = LocalDate.now().getDayOfMonth();
        Integer mes = LocalDate.now().getMonthValue();
        Integer ano = LocalDate.now().getYear();
        Boolean verificador = true;
        for (Plantao plantao: plantoes) {
            if (plantao.getDia().equals(dia) && plantao.getMes().equals(mes) && plantao.getAno().equals(ano)) {
                verificador = false;
            }
        }
        if (verificador) {
            Plantao plantao = new Plantao(dia, mes, ano);
            plantoes.add(plantao);
        }
    }
    
    public Integer getQtdPlantao() {
        return plantoes.size();
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public List<Plantao> getPlantoes() {
        return plantoes;
    }

    public void setPlantoes(List<Plantao> plantoes) {
        this.plantoes = plantoes;
    }

    public List<Laudo> getLaudos() {
        return laudos;
    }

    public void setLaudos(List<Laudo> laudos) {
        this.laudos = laudos;
    }

    @Override
    public String toString() {
        return String.format("""
                             crm: %s
                             %s
                             Especialidade: %s
                             Plantões: %s
                             Laudos: %s
                             """
                , crm, 
                super.toString(), 
                especialidade, 
                plantoes, 
                laudos);
    }
}
