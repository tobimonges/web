package bootcamp.postulantes.services;

import bootcamp.postulantes.models.LenguajeModel;
import bootcamp.postulantes.repositories.LenguajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class LenguajeService {
    @Autowired
    LenguajeRepository lenguajeRepository;

    public LenguajeModel saveLenguaje(LenguajeModel lenguaje) {
        return lenguajeRepository.save(lenguaje);
    }

    public boolean deleteLenguaje(Integer id) {
        try {
            lenguajeRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList<LenguajeModel> findAllLenguajes() {
        return (ArrayList<LenguajeModel>) lenguajeRepository.findAll();
    }

    public Optional<LenguajeModel> findById(Integer id) {
        return lenguajeRepository.findById(id);
    }
}