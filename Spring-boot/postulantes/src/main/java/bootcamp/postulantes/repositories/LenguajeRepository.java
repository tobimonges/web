package bootcamp.postulantes.repositories;

import bootcamp.postulantes.models.LenguajeModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LenguajeRepository extends CrudRepository<LenguajeModel, Integer> {
}
