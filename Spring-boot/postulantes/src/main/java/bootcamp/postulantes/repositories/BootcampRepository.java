package bootcamp.postulantes.repositories;

import bootcamp.postulantes.models.BootcampModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BootcampRepository extends CrudRepository<BootcampModel, Integer> {
}
