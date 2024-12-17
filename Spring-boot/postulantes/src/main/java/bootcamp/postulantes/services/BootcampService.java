package bootcamp.postulantes.services;

import bootcamp.postulantes.models.BootcampModel;
import bootcamp.postulantes.repositories.BootcampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class BootcampService {
    @Autowired
    BootcampRepository bootcampRepository;

    public BootcampModel saveBootcamp(BootcampModel bootcamp) {
        return bootcampRepository.save(bootcamp);
    }

    public boolean deleteBootcamp(Integer id) {
        try {
            bootcampRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList<BootcampModel> findAllBootcamps() {
        return (ArrayList<BootcampModel>) bootcampRepository.findAll();
    }

    public Optional<BootcampModel> findById(Integer id) {
        return bootcampRepository.findById(id);
    }
}
