package bootcamp.postulantes.repositories;

import bootcamp.postulantes.models.PostulanteModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface PostulanteRepository extends CrudRepository<PostulanteModel, Integer> {
    Optional<PostulanteModel> findByNroCedula (Integer ci);
    Optional<PostulanteModel> deletePostulanteByNroCedula(Integer ci);
}
