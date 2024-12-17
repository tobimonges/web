package bootcamp.postulantes.models;

import jakarta.persistence.*;

@Entity
@Table(name = "profesor")
public class ProfesorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    private int nro_cedula;
    private String nombre,apellido,correo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNro_cedula() {
        return nro_cedula;
    }

    public void setNro_cedula(int nro_cedula) {
        this.nro_cedula = nro_cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
