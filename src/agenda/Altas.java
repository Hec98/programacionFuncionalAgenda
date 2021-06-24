package agenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Altas {
    public void insertar(String nombre, int telefono, String rfc, int edad) {
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO agenda (nombre, telefono, rfc, edad) VALUES (?,?,?,?)");
            ps.setString(1, nombre);
            ps.setInt(2, telefono);
            ps.setString(3, rfc);
            ps.setInt(4, edad);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error -> "+ e.toString());
        }
    }
}
