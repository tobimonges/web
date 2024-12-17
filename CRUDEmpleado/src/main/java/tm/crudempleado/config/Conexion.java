package tm.crudempleado.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static final String username = "postgres";
    public static final String password = "root";
    public static final String database = "db_empleado";
    public static final String url = "jdbc:postgresql://localhost:5432/" + database;

    public static Connection getConnection() {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(url,username,password);
            System.out.println("\nCONEXION ESTABLECIDA!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }
}
