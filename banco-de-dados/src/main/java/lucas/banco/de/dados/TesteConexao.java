/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucas.banco.de.dados;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author lukas
 */
public class TesteConexao {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        
        JdbcTemplate con = conexao.getConnection();
        
        con.execute("drop table if exists filme");
        
        con.execute("create table filme("
        + "id int primary key auto_increment,"
        + "nome varchar(45),"
        + "ano_lancamento int"
        + ")");
        
        
        // Insert
        con.update("insert into filme values (null, 'Shrek 5', 2023)");
        con.update("insert into filme values (null, 'Veloses e furiosos', 2023)");
        con.update("insert into filme values (null, 'Vingadores 10', 2040)");
        
        Filme novoFilme = new Filme(null, "Bolsonaro x Lula", 2024);
        
        con.update("insert into filme values (?, ?, ?)", 
                novoFilme.getId(),
                novoFilme.getNome(),
                novoFilme.getAnoLancamento()); // JDBC confia que você colocou a posição correta
        
        List<Filme> listaDeFilmes = new ArrayList();
        
        listaDeFilmes = con.query("select * from filme", new BeanPropertyRowMapper(Filme.class)); //Passar objeto no segundo argumento
        
        System.out.println(listaDeFilmes);
        
        // Busca com where
        listaDeFilmes = con.query("select * from filme where nome = ?", new BeanPropertyRowMapper(Filme.class), "Shrek 5");
        System.out.println(listaDeFilmes);
        
        //Editando
        con.update("update filme set nome = 'Barbie' where nome = ?", "Shrek 5");
        
        // Nova lista de dados após a atualização
        listaDeFilmes = con.query("select * from filme", new BeanPropertyRowMapper<Filme>(Filme.class));
        
        System.out.println(listaDeFilmes);
        
        // Deletando
        con.update("delete from filme where id = ?", 1);
        
        // Nova lista de dados após a atualização (sempre atualizar)
        listaDeFilmes = con.query("select * from filme", new BeanPropertyRowMapper(Filme.class));
        
        System.out.println(listaDeFilmes);
    }
}
