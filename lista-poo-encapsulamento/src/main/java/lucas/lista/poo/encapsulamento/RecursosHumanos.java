/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.lista.poo.encapsulamento;

/**
 *
 * @author lukas
 */
public class RecursosHumanos {

    private Integer totalPromovidos;
    private Integer salariosReajustados;

    public RecursosHumanos() {
        this.totalPromovidos = 0;
        this.salariosReajustados = 0;
    }
    
    

    void reajustarSalario(Double reajuste, Colaborador colab) {
        Double valorReajustado = (colab.getSalario() * reajuste) + colab.getSalario();
        salariosReajustados++;
        colab.setSalario(valorReajustado);
    }

    void promoverColaborador(Colaborador colab, String cargo, Double salario) {

        if (salario > colab.getSalario()) {
            colab.setCargo(cargo);
            colab.setSalario(salario);
            totalPromovidos++;
            System.out.println("\nPROMOVIDO\n");
        } else {
            System.out.println("Operação inválida");
        }
    }

//    void exibirInfoColaboradores(Colaborador colab) {
//        System.out.println("\n----------------------------------\n"
//                + "Colaborador: " + colab.getNome() + "\n"
//                + "Cargo: " + colab.getCargo() + "\n"
//                + "Salário: " + colab.getSalario());
//    }
    
    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public Integer getSalariosReajustados() {
        return salariosReajustados;
    }
    
    @Override
    public String toString(){
        return String.format("RH:"
        + "\nReajustes: %d"
        + "\nPromoções: %d", salariosReajustados, totalPromovidos);
    }
    
}