package bootcamp.postulantes.repositories;

import bootcamp.postulantes.models.LoginModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends CrudRepository<LoginModel, Integer> {
}
