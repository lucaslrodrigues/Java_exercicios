/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.ac2.segunda.atividade;

/**
 *
 * @author lukas
 */
public class PetShop {
    private String nome;
    private Double faturamentoTotal;

    public PetShop(String nome) {
        this.nome = nome;
        this.faturamentoTotal = 0.0;
    }
    
    public void darBanho(Pet pet, Double valor){
        if (valor > 0){
//            pet.setQtdVisitasAoPetShop(pet.getQtdVisitasAoPetShop() + 1);
            pet.setQtdVisitasAoPetShop();
            pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + valor);
            faturamentoTotal += valor;            
        }else{
            System.out.println("Valor invalido");
        }
    }
    
    public void darBanho (Pet pet, Double valor, Integer desconto){
        Double desc = valor - (valor * (desconto.doubleValue() / 100));
//        pet.setQtdVisitasAoPetShop(pet.getQtdVisitasAoPetShop() + 1);
        pet.setQtdVisitasAoPetShop();
        pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + desc);
        faturamentoTotal += desc;  
    }

    @Override
    public String toString() {
        return String.format("-----------------------------------------------\n"
                + "PetShop: %s\nFaturamentoTotal: %.2f", nome, faturamentoTotal);
    }
    
    
}
