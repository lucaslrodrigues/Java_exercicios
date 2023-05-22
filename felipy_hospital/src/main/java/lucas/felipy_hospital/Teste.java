/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.felipy_hospital;

/**
 *
 * @author lukas
 */
public class Teste {
    public static void main(String[] args) {
        Hospital hospital = new Hospital(1, "Santa Casa", 5);
        Enfermeiro func1 = new Enfermeiro("Elis Regina", 5000.00, "111122221111");
        Medico func2 = new Medico("111122221", "Clinico", "Elis Regina", 15000.00);
        
        System.out.println(hospital);
        
        hospital.contratarFuncionario(func1);
        hospital.contratarFuncionario(func2);

        func1.aplicarMedicacao();
        func1.realizarTriagem();
        func1.realizarPlantao();
        func1.getQtdPlantao();

        func2.realizarPlantao();
        func2.getQtdPlantao();
        
        System.out.println(func1);
        System.out.println(func2);
    }
}
