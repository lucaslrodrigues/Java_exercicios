/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.exemplo.classe.abstrata;

import java.time.LocalDate;

/**
 *
 * @author lukas
 */
public abstract class Veiculo {
    protected String proprietario;
    protected Integer anoFabricacao;
    protected String marca;

    public Veiculo(String proprietario, Integer anoFabricacao, String marca) {
        this.proprietario = proprietario;
        this.anoFabricacao = anoFabricacao;
        this.marca = marca;
    }

    public Integer calcularTempoDeUso(){
        return LocalDate.now().getYear() - anoFabricacao;
    }
    
    public abstract void relatorioDeRevisao();
    
    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
