/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.exemplo.classe.abstrata;

/**
 *
 * @author lukas
 */
public class TesteMecanica {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Bicicleta(10, 80.5, "Lucas", 2005, "Fiat");
        Veiculo veiculo2 = new Carro(false, 1.3, "Leo", 1978, "Gol");
        
        Mecanica mecanica1 = new Mecanica("Mecanica dos Irmãos");
        
        mecanica1.registrarCLiente(veiculo1);
        mecanica1.registrarCLiente(veiculo2);
        
        mecanica1.exibirRelatorioRevisaoClientes();
    }
}
