package bootcamp.postulantes.services;

import bootcamp.postulantes.models.LoginModel;
import bootcamp.postulantes.repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    LoginRepository loginRepository;

    public LoginModel saveLogin(LoginModel login) {
        return loginRepository.save(login);
    }

    public boolean deleteLogin(Integer id) {
        try {
            loginRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList<LoginModel> findAllLogins() {
        return (ArrayList<LoginModel>) loginRepository.findAll();
    }

    public Optional<LoginModel> findById(Integer id) {
        return loginRepository.findById(id);
    }
    
}
