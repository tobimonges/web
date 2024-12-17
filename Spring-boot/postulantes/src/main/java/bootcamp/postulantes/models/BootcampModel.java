package bootcamp.postulantes.models;

import jakarta.persistence.*;

@Entity
@Table(name = "bootcamp")
public class BootcampModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    private int id_lenguaje, id_profesor;
    private String fecha_inicio,fecha_fin,descripcion,imagen,titulo, nombre_profesor, apellido_profesor, nombre_lenguaje;
    private boolean activo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_lenguaje() {
        return id_lenguaje;
    }

    public void setId_lenguaje(int id_lenguaje) {
        this.id_lenguaje = id_lenguaje;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombre_profesor() {
        return nombre_profesor;
    }

    public void setNombre_profesor(String nombre_profesor) {
        this.nombre_profesor = nombre_profesor;
    }

    public String getApellido_profesor() {
        return apellido_profesor;
    }

    public void setApellido_profesor(String apellido_profesor) {
        this.apellido_profesor = apellido_profesor;
    }

    public String getNombre_lenguaje() {
        return nombre_lenguaje;
    }

    public void setNombre_lenguaje(String nombre_lenguaje) {
        this.nombre_lenguaje = nombre_lenguaje;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}

