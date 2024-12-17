package bootcamp.postulantes.services;

import bootcamp.postulantes.models.UsuarioModel;
import bootcamp.postulantes.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public UsuarioModel saveUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public boolean deleteUsuario(Integer id) {
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ArrayList<UsuarioModel> findAllUsuarios() {
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public Optional<UsuarioModel> findById(Integer id) {
        return usuarioRepository.findById(id);
    }
}
