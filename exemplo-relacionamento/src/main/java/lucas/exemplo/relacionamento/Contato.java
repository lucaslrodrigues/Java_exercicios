/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.exemplo.relacionamento;

/**
 *
 * @author lukas
 */
public class Contato {
    private String nome;
    private String telefone;
    private Boolean bloqueado;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = false;
    }
    
    public void bloquear(){
        bloqueado = true;
    }
    
    public void desbloquear(){
        bloqueado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    @Override
    public String toString() {
//        String fraseBloq;
//        if(bloqueado){;
//            fraseBloq = "sim";
//        }else{
//            fraseBloq = "não";
//        }
        return String.format("\nNome: %s\n"
                + "Telefone: %s\n"
                + "Bloqueado: %s", 
                nome,
                telefone,
                (bloqueado ? "sim" : "não"));
    }
    
    
}
