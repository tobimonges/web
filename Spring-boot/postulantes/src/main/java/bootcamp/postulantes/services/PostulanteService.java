package bootcamp.postulantes.services;

import bootcamp.postulantes.models.BootcampModel;
import bootcamp.postulantes.models.PostulanteModel;
import bootcamp.postulantes.repositories.PostulanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PostulanteService {
    @Autowired
    PostulanteRepository postulanteRepository;

    public PostulanteModel savePostulante (PostulanteModel postulante) {
        return postulanteRepository.save(postulante);
    }

    public boolean deletePostulante(Integer id) {
        try {
            postulanteRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public ArrayList<PostulanteModel> findAllPostulantes() {
        return (ArrayList<PostulanteModel>) postulanteRepository.findAll();
    }

    public Optional<PostulanteModel> findById(Integer id) {
        return postulanteRepository.findById(id);
    }
    public Optional<PostulanteModel> findByNroCedula (Integer ci) {
        return postulanteRepository.findByNroCedula(ci);
    }

}
