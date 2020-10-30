
package myconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JavaBD {

    private Connection connection;
    
    
    public JavaBD() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost/Cadastro", "root", "");
         System.out.println("Conectado com sucesso.");
    }
    
    
    
    public static void main(String[] args) {
        
            try {
                new JavaBD();
            } catch (Exception e) {
                System.out.println("Nao conctado.");
            }
            
        
    
    }
    
    
    
    
    
}
