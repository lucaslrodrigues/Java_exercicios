/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.banco.de.dados;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author lukas
 */
public class Conexao {
    private JdbcTemplate connection;
    
    public Conexao(){
        BasicDataSource dataSource = new BasicDataSource();

        dataSource​.setDriverClassName("org.h2.Driver"); // Driver de conexão (Pesquisar o driver de conexão do banco que for utilizar e colocar aqui)

        dataSource​.setUrl("jdbc:h2:file:./banco_teste"); // Host de conexão: dependencia > banco > caminho (url na azure) > nome banco

        
//      (não colocar os dados reais no login e senha, colocar variaveis de ambiente no lugar)
        dataSource​.setUsername("sa"); // nome usuario (root) 

        dataSource​.setPassword(""); // senha (no h2 não precisa de nenhum dos dois)

        this.connection = new JdbcTemplate(dataSource); // Criando a conexão
    }

    public JdbcTemplate getConnection() {
        return connection;
    }
}
