package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    
    // Configuración de tu base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/nombre_de_tu_bd";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "tu_contrasena";

    public static Connection obtenerConexion() {
        Connection conexion = null;
        try {
            // Establecer la conexión
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("¡Conexión establecida con éxito!");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return conexion;
    }

    public static void main(String[] args) {
        // Probar la conexión
        obtenerConexion();
    }
}
