/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.felipy_hospital;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lukas
 */
public class Hospital {
    private Integer id;
    private String nome;
    private Integer avaliacao;
    private List<Funcionario> funcionarios;

    public Hospital(int id, String nome, int avaliacao) {
        this.id = id;
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.funcionarios = new ArrayList();
    }
    
    
    public void contratarFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }
    
    public Funcionario buscarFuncionarioPeloNome (String nome) {
        for (Funcionario funcionario: funcionarios) {
            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                return funcionario;
            }
        }
        return null;
    }
    
    public List<Funcionario> buscarEnfermeiros (String nome) {
        List<Funcionario> enfermeiros = new ArrayList();
        for (Funcionario funcionario: funcionarios) {
            if (funcionario instanceof Enfermeiro) {
                enfermeiros.add(funcionario);
            }
        }
        return enfermeiros;
    }
    
    public List<Funcionario> buscarMedicos (String nome) {
        List<Funcionario> enfermeiros = new ArrayList();
        for (Funcionario funcionario: funcionarios) {
            if (funcionario instanceof Enfermeiro) {
                enfermeiros.add(funcionario);
            }
        }
        return enfermeiros;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return String.format("""
                             Nome: %s
                             Avaliacao: %d
                             Funcionarios: %s
                             """
                , nome,
                avaliacao,
                funcionarios);
    }
}
