/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.exemplo.classe.abstrata;

/**
 *
 * @author lukas
 */
public class Carro extends Veiculo{
    private Boolean possuiEstepe;
    private Double nivelOleo;

    public Carro(Boolean possuiEstepe, 
            Double nivelOleo, 
            String proprietario, 
            Integer anoFabricacao, 
            String marca) {
        super(proprietario, anoFabricacao, marca);
        this.possuiEstepe = possuiEstepe;
        this.nivelOleo = nivelOleo;
    }

    @Override
    public void relatorioDeRevisao() {
        System.out.println("Relatorio do carro de: "+ proprietario);
        if (!possuiEstepe) {
            System.out.println("Necessário comprar um estepe");
        }else{
            System.out.println("Estepe OK");
        }
        
        if (nivelOleo < 1.5){
            System.out.println("Necessário comprar óleo");
        }else{
            System.out.println("Nívle de óleo ok!");
        }
    }
    
    

    public Boolean getPossuiEstepe() {
        return possuiEstepe;
    }

    public void setPossuiEstepe(Boolean possuiEstepe) {
        this.possuiEstepe = possuiEstepe;
    }

    public Double getNivelOleo() {
        return nivelOleo;
    }

    public void setNivelOleo(Double nivelOleo) {
        this.nivelOleo = nivelOleo;
    }
    
    
}
