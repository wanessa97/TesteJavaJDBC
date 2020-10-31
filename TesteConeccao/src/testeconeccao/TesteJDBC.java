package testeconeccao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteJDBC {
    
     public static String status = "Nao conectou";
    public TesteJDBC(){}
    public static void getTesteJDBC(){}

    public static String statusConection(){return status;
}
    public static void FecharConexao(){}
    public static void ReiniciarConexao(){}
    
    public static Connection getJDBC(){
        Connection connection = null;
        
        try {
            String DRIVER = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost/Cadastro";
            String user = "root";
            String pass = "";
            connection = DriverManager.getConnection(url, user, pass);
            if (connection != null) {
                status = ("Conectado com sucesso!");
            } else { status = ("Nao conectou"); }
            return connection;
        } catch (SQLException e) {
            System.out.println("Nao conectou ao banco de dados.");
            return null;
        }
    
    
    
}
}
