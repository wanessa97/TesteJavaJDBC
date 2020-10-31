package testeconeccao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TesteConeccao {

    public static void main(String[] args) {
       Connection conn = TesteJDBC.getJDBC();
       System.out.println(TesteJDBC.status);
       
       Scanner entrada = new Scanner (System.in);
       
       System.out.println("CPF: ");
       String CPF = entrada.nextLine();
       System.out.println("Nome: ");
       String nome = entrada.nextLine();
       System.out.println("Cidade: ");
       String cidade = entrada.nextLine();
       System.out.println("Rua: ");
       String rua = entrada.nextLine();
       
       String sql = "INSERT INTO pessoafisica (CPF, nome, cidade, rua) VALUES (?, ?, ?, ?)";
      
       
       try {
           
           PreparedStatement comando = conn.prepareStatement(sql);
           comando.setString(1, CPF);
           comando.setString(2, nome);
           comando.setString(3, cidade);
           comando.setString(4, rua);
           comando.execute();
           conn.close();
       } catch (SQLException e) {
           e.printStackTrace();
       }
    }
    
}
