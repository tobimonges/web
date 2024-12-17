package bootcamp.postulantes.models;

import jakarta.persistence.*;

@Entity
@Table(name = "postulante_lenguaje")

public class PostulanteLenguajeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private int id;

    private int idPostulante,idLenguaje;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPostulante() {
        return idPostulante;
    }

    public void setIdPostulante(int idPostulante) {
        this.idPostulante = idPostulante;
    }

    public int getIdLenguaje() {
        return idLenguaje;
    }

    public void setIdLenguaje(int idLenguaje) {
        this.idLenguaje = idLenguaje;
    }
}
