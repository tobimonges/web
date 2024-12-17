package bootcamp.postulantes.services;

import bootcamp.postulantes.models.ProfesorModel;
import bootcamp.postulantes.repositories.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProfesorService {
    @Autowired
    ProfesorRepository profesorRepository;

    public ProfesorModel saveProfesor(ProfesorModel profesor) {
        return profesorRepository.save(profesor);
    }

    public boolean deleteProfesor(Integer id) {
        try {
            profesorRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList<ProfesorModel> findAllProfesores() {
        return (ArrayList<ProfesorModel>) profesorRepository.findAll();
    }

    public Optional<ProfesorModel> findById(Integer id) {
        return profesorRepository.findById(id);
    }

}
