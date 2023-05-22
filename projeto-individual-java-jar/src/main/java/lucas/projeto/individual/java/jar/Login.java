/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.projeto.individual.java.jar;

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
    
    private void Logar (String login, String senha) {                                         
        Boolean verify = verificarDados(login, senha);
        
        if (verify){
            try {
                consultaBanco(String login, String senha);
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Email ou senha vazios");
        }
        
    }     
    
    private Boolean verificarDados(String login, String senha){
        
        if ("".equals(login) || "".equals(senha)){
            System.out.println( "Você tem campos a serem preenchidos");
            return false;
        }
        return true;
    }
    
    
    
    private void consultaBanco(String login, String senha) throws IOException{
        
        Conection conect = new Conection();
        
        JdbcTemplate con = conect.getConnection();
        
        List<UserLogin> user = new ArrayList();
        
        user = con.query(String.format("select * from Usuario where email = '%s' and senha = '%s'", login, senha ), 
                new BeanPropertyRowMapper(UserLogin.class));
        Integer sizeUser = user.size();
        
        if (sizeUser > 0) {
            Looca looca = new Looca(user);
           
        }else{
            System.out.println("Email ou senha incorreto!");
        }
    }
}
