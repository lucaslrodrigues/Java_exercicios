/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.projeto.individual.java.jar;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
/**
 *
 * @author lukas
 */
public class ConectionMySql {
    private JdbcTemplate connectionMySql;
    
    public ConectionMySql(){
        BasicDataSource dataSource = new BasicDataSource();

        dataSource​.setDriverClassName("com.mysql.cj.jdbc.Driver");

        dataSource​.setUrl("jdbc:mysql://containerDB/MonitorMind");

        dataSource​.setUsername("root");

        dataSource​.setPassword("urubu100");

        this.connectionMySql = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConnection() {
        return connectionMySql;
    }
}
