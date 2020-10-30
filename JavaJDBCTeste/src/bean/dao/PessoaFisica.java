package bean.dao;

import bean.Pessoa;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PessoaFisica {
    
    
    private Connection con = null;

    public PessoaFisica() {
        
        con = ConnectionFactory.getConnection();
    }
    
    
    public boolean salvar (Pessoa pessoafisica){
        
        String sql = "INSERT INTO pessoafisica (CPF, nome, cidade, rua) VALUES (?, ?, ?, ?)";
        
        PreparedStatement stnt = null;
        
        try {
            stnt = con.prepareCall(sql);
            stnt.setString(1, pessoafisica.getCPF());
            stnt.setString(2, pessoafisica.getNome());
            stnt.setString(3, pessoafisica.getCidade());
            stnt.setString(4, pessoafisica.getRua());
            
            stnt.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            
           System.err.println("Erro: " + ex);
           return false;
        
        } finally {
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stnt);
        }
    
 
        
    }
    
}
