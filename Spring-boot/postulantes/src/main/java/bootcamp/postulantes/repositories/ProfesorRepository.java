package bootcamp.postulantes.repositories;

import bootcamp.postulantes.models.ProfesorModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends CrudRepository<ProfesorModel, Integer> {
}
