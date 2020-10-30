package connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    
    private static final String DRIVER ="com.mysql.jdbc.Driver";
    private static final String URL ="jdbc:mysql://localhost:3306/";
    private static final String USER ="root";
    private static final String PASS ="";
    
    public static Connection getConnection(){
        
        try {
            
            Class.forName(DRIVER);
            
            return (Connection) DriverManager.getConnection(URL, USER, PASS);
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            
            throw new RuntimeException("Erro na coneccao.", ex);
        }
    }
     
    
    public static void closeConnection(Connection con){
        if(con != null) {
            
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        }
        
    }
    public static void closeConnection(Connection con, PreparedStatement atnt){
       
        if(atnt != null) {
            
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
                
            }
        }
        closeConnection(con);
        
    }
    public static void closeConnection(Connection con, PreparedStatement atnt, ResultSet rs){
       
        if(rs != null) {
            
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        }
        closeConnection(con, atnt);
        
    }
    
}
    
