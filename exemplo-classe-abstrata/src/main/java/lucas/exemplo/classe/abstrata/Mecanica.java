/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.exemplo.classe.abstrata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lukas
 */
public class Mecanica {
    private String nome;
    private List<Veiculo> veiculos;

    public Mecanica(String nome) {
        this.nome = nome;
        this.veiculos = new ArrayList<>();
    }
    
    public void registrarCLiente(Veiculo veiculoCliente){
        veiculos.add(veiculoCliente);
    }
    
    public void exibirRelatorioRevisaoClientes(){
        for (Veiculo veiculo: veiculos){
            veiculo.relatorioDeRevisao();
        }
    }
    
    
    
}
