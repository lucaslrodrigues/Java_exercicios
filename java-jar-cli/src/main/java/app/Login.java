/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import dados.CadastroComponentes;
import sql.Conection;
import models.UserLogin;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author lukas
 */
public class Login {
    private String login;
    private String senha;
    
    public Login(String login, String senha) {
        this.login = login;
        this.senha = senha;
//        verificarDados();
    }
    
    public void logar () throws IOException, InterruptedException {
        Boolean verify = verificarDados();
        
        if (verify){
            System.out.println("Campos preenchidos");
            try {
                consultaBanco();
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Email ou senha vazios");
        }
        
    }     
    
    private Boolean verificarDados(){
        System.out.println("Verificando campos digitados...");
        if ("".equals(login) || "".equals(senha)){
            System.out.println( "Você tem campos a serem preenchidos");
            return false;
        }
        return true;
    }
    
    
    
    private void consultaBanco() throws IOException, InterruptedException{
        
        Conection conect = new Conection();
        
        JdbcTemplate con = conect.getConnection();
        
        List<UserLogin> user = new ArrayList();
        
        user = con.query(String.format("select * from Usuario where email = '%s' and senha = '%s'", login, senha ), 
                new BeanPropertyRowMapper(UserLogin.class));
        Integer sizeUser = user.size();
        
        if (sizeUser > 0) {
            LogGenerator.generateLog("Usuario logado");
            LogGenerator.generateLog("Entrando com o login " + login);
            CadastroComponentes looca = new CadastroComponentes(user);
           
        }else{
            System.out.println("Email ou senha incorreto!");
            LogGenerator.generateLogErro("Email ou senha incorretos");
        }
    }
}
