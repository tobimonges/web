package bootcamp.postulantes.models;


import jakarta.persistence.*;

@Entity
@Table(name = "lenguaje")
public class LenguajeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    private String nombre_lenguaje;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_lenguaje() {
        return nombre_lenguaje;
    }

    public void setNombre_lenguaje(String nombre_lenguaje) {
        this.nombre_lenguaje = nombre_lenguaje;
    }
}
