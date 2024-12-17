package bootcamp.postulantes.repositories;

import bootcamp.postulantes.models.PostulanteLenguajeModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostulanteLenguajeRepository extends CrudRepository<PostulanteLenguajeModel, Integer> {
}
