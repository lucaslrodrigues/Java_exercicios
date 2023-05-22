/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.projeto.individual.java.jar;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Volume;
import com.github.britooo.looca.api.group.rede.RedeInterface;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 *
 * @author Nathan David
 */
public class InfoPc {
    
    private Looca looca;

    public InfoPc() {
        this.looca = new Looca();
    }
    
//    String numeroSerial() throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("wmic bios get serialnumber").getInputStream()));
//        String line;
//        
//        while ((line = reader.readLine()) != null) {
//            if (!line.startsWith("SerialNumber") && line.length() > 0) {
//                return line.trim();
//            }
//        }
//        
//        return null;        
//    }
//    
//    String numeroSerialLinux() throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("sudo dmidecode -s system-serial-number").getInputStream()));
//        String line;
//        String serial = null;
//        if(reader.readLine() == null){
//            serial ="temporario";
//        }else{
//            serial = reader.readLine();
//        }
//        
//        return serial;
//    }
    
    String hostName(){
        return looca.getRede().getParametros().getHostName();
    }
    
    String mac(){
        List<RedeInterface> redes  = looca.getRede().getGrupoDeInterfaces().getInterfaces();
        
        for (RedeInterface mac : redes) {
            return mac.getEnderecoMac();
        }
        
        return null;
    }
 
    String sistemaOperacional() {
        return looca.getSistema().getSistemaOperacional();
    }
    
    Double frequenciaCpu() {
        Long freqReal = looca.getProcessador().getFrequencia();
        
        Double freqConvertida = (double) freqReal / 1000000000;
        
        return Math.round(freqConvertida * Math.pow(10, 1)) / Math.pow(10, 1);
    }
    
    String nomeCPU() {
        return looca.getProcessador().getNome();
    }
    
    Integer nucleoFisico() {
        return looca.getProcessador().getNumeroCpusFisicas();
    }
    
    Integer nucleoLogico() {
        return looca.getProcessador().getNumeroCpusLogicas();
    }
    
    Double qtdRam() {
        Long qtdRamBytes = looca.getMemoria().getTotal();
        Long ramReal = qtdRamBytes / (1024 * 1024 * 1024); 
        Integer ramIdeal = null;
        
        if (ramReal < 4) {
            return 4.0;
        } else if (ramReal < 8) {
            return 8.0;
        } else {
            return 16.0;
        } 
    }
    
    Double qtdArmazenamento() {
        Long qtdArmazenamentoBytes = null;
       
        List<Volume> volumeDisco = looca.getGrupoDeDiscos().getVolumes();
        for (Volume discoVolume : volumeDisco) {
            qtdArmazenamentoBytes = discoVolume.getTotal();
        }
        
        Long valorReal = qtdArmazenamentoBytes / (1024 * 1024 * 1024);
        
        if (valorReal < 256) {
            return 256.0;
        } else if (valorReal < 512) {
            return 512.0;
        } else {
            return 1024.0;
        }
    }
    
    String tipoDisco() throws IOException {
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "vol c:");
        builder.redirectErrorStream(true);
        Process process = builder.start();
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = reader.readLine();

        if (line.contains("SSD") && line.length() > 0) {
            return "ssd";
        } else {
            return "hd";
        }
    }
}
