/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.exemplo.classe.abstrata;

/**
 *
 * @author lukas
 */
public class Bicicleta extends Veiculo{
    private Integer calibragemPneu;
    private Double pesoCiclista;

    public Bicicleta(Integer calibragemPneu, 
            Double pesoCiclista, 
            String proprietario, 
            Integer anoFabricacao, 
            String marca) {
        super(proprietario, anoFabricacao, marca);
        this.calibragemPneu = calibragemPneu;
        this.pesoCiclista = pesoCiclista;
    }

    @Override
    public void relatorioDeRevisao() {
        System.out.println("Exibindo relátorio da bike de: " + proprietario);
        if (pesoCiclista == 85 && calibragemPneu != 36){
            System.out.println("Necessário calibrar pneu!!");
        }else{
            System.out.println("Tudo certo");
        }
    }
    
    public Integer getCalibragemPneu() {
        return calibragemPneu;
    }

    public void setCalibragemPneu(Integer calibragemPneu) {
        this.calibragemPneu = calibragemPneu;
    }

    public Double getPesoCiclista() {
        return pesoCiclista;
    }

    public void setPesoCiclista(Double pesoCiclista) {
        this.pesoCiclista = pesoCiclista;
    }
    
    
}
