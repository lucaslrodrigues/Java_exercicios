/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consultoria;

/**
 *
 * @author lukas
 */
public class TesteConsultoria {
    public static void main(String[] args) {
        Consultoria consult = new Consultoria("sptechInc", 2);
        
        Desenvolvedor devNull = new Desenvolvedor(null, null, null);
        Desenvolvedor dev1 = new Desenvolvedor("Lucas", 40, 20.0);
        DesenvolvedorMobile dev2 = new DesenvolvedorMobile(40, 20.0, "Bea",40, 10.0);;
        Desenvolvedor dev3 = new Desenvolvedor("Felipy", 40, 20.0);
        
        consult.contratar(dev1);
        consult.contratar(dev2);
        consult.contratar(dev3);
        
        System.out.println("\n------ Existe por nome -----");
        System.out.println("null teste: " + consult.existePorNome("null"));
        System.out.println("Lucas: " + consult.existePorNome("Lucas"));
        System.out.println("Bea: " + consult.existePorNome("Bea"));
        System.out.println("Felipy: " + consult.existePorNome("Felipy"));
        
        System.out.println("\n------ Get quantidade de desenvolvedores -----");
        System.out.println(consult.getQuantidadeDesenvolvedores());
        
        System.out.println("\n------ Get quantidade de desenvolvedores mobile -------");
        System.out.println(consult.getQuantidadeDesenvolvedorMobile());
        
        System.out.println("\n------ Get total de salarios ------");
        System.out.println(consult.getTotalSalarios());
        
        System.out.println("\n------ Buscar desenvolvedor por nome -----");
        System.out.println(consult.buscarDesenvolvedorPorNome("Lucas"));
        System.out.println(consult.buscarDesenvolvedorPorNome("Bea"));
        System.out.println("\nFelipy: " + consult.buscarDesenvolvedorPorNome("Felipy"));
        
        System.out.println("\n--------- Consultoria --------\n" + consult);
    }
}
