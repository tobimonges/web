package bootcamp.postulantes.models;


import jakarta.persistence.*;

@Entity
@Table(name = "postulante")
public class PostulanteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    @Column(unique = true, nullable = false)
    private int nroCedula;
    private int bootcampId;
    private String nombreBootcamp;
    private String nombre,apellido,telefono,direccion,correo;
    private boolean estudioUniversitario,notebook,aceptado;

    @Column(nullable = false, columnDefinition = "boolean default false")
    private Boolean expLaboral = false;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNroCedula() {
        return nroCedula;
    }

    public void setNroCedula(int nroCedula) {
        this.nroCedula = nroCedula;
    }

    public int getBootcampId() {
        return bootcampId;
    }

    public void setBootcampId(int bootcampId) {
        this.bootcampId = bootcampId;
    }

    public String getNombreBootcamp() {
        return nombreBootcamp;
    }

    public void setNombreBootcamp(String nombreBootcamp) {
        this.nombreBootcamp = nombreBootcamp;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isExpLaboral() {
        return expLaboral;
    }

    public void setExpLaboral(boolean expLaboral) {
        this.expLaboral = expLaboral;
    }

    public boolean isEstudioUniversitario() {
        return estudioUniversitario;
    }

    public void setEstudioUniversitario(boolean estudioUniversitario) {
        this.estudioUniversitario = estudioUniversitario;
    }

    public boolean isNotebook() {
        return notebook;
    }

    public void setNotebook(boolean notebook) {
        this.notebook = notebook;
    }

    public boolean isAceptado() {
        return aceptado;
    }

    public void setAceptado(boolean aceptado) {
        this.aceptado = aceptado;
    }
}
