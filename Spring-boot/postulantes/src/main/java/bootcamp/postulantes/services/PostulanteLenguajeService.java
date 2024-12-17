package bootcamp.postulantes.services;

import bootcamp.postulantes.models.PostulanteLenguajeModel;
import bootcamp.postulantes.repositories.PostulanteLenguajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PostulanteLenguajeService {
    @Autowired
    PostulanteLenguajeRepository postulanteLenguajeRepository;

    public PostulanteLenguajeModel savePostulanteLenguaje (PostulanteLenguajeModel postulanteLenguaje) {
        return postulanteLenguajeRepository.save(postulanteLenguaje);
    }

    public boolean deletePostulanteLenguaje(Integer id) {
        try {
            postulanteLenguajeRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public ArrayList<PostulanteLenguajeModel> findAllPostulanteLenguajes() {
        return (ArrayList<PostulanteLenguajeModel>) postulanteLenguajeRepository.findAll();
    }

    public Optional<PostulanteLenguajeModel> findById(Integer id) {
        return postulanteLenguajeRepository.findById(id);
    }

}
