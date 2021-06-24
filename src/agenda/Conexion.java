package agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConexion() {
        String url = "jdbc:mysql://localhost:3306/agenda";
        try {
            Connection con = DriverManager.getConnection(url,"root","");
            return con; 
        } catch (SQLException e) {
            System.err.println("Error -> "+ e.toString());
            return null;
        }    
    }     
}
