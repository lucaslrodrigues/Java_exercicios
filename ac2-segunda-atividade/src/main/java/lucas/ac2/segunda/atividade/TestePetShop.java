/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.ac2.segunda.atividade;

/**
 *
 * @author lukas
 */
public class TestePetShop {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Luizinho", "Lince");
        Pet pet2 = new Pet("Luizinho", "Golden retriever");
        
        PetShop petShop = new PetShop("Amigo pet");
        
        petShop.darBanho(pet1, 50.00);
        System.out.println(pet1);
        petShop.darBanho(pet2, 50.00, 10);
        System.out.println(pet2);
        
        System.out.println(petShop);
    }
}
