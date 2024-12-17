package tm.crudempleado.modelo.dao;

import tm.crudempleado.config.Conexion;
import tm.crudempleado.modelo.Empleado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmpleadoDAO {

    private Connection c = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public ArrayList<Empleado> ListarTodos() {
        ArrayList<Empleado> lista = new ArrayList<>();
        try {
            c = Conexion.getConnection();
            String sql = "Select * from empleado";
            ps = c.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Empleado obj = new Empleado();

                obj.setIdEmpleado(rs.getInt("id_empleado"));
                obj.setNombre(rs.getString("nombre"));
                obj.setApellido(rs.getString("apellido"));
                obj.setFechaingreso(rs.getString("fecha_ingreso"));
                obj.setSueldo(rs.getDouble("sueldo"));

                lista.add(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (c != null) {
                    c.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return lista;
    }
}
