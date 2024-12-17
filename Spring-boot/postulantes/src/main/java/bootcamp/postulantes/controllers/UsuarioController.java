package bootcamp.postulantes.controllers;

import bootcamp.postulantes.models.UsuarioModel;
import bootcamp.postulantes.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping()
    public UsuarioModel saveUsuario(@RequestBody UsuarioModel usuario) {
        return this.usuarioService.saveUsuario(usuario);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        boolean ok = this.usuarioService.deleteUsuario(id);
        return ok ? "Se elimino el usuario" : "No se pudo eliminar";
    }

    @GetMapping
    public ArrayList<UsuarioModel> findAllUsuarios() {
        return usuarioService.findAllUsuarios();
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> findUsuarioById(@PathVariable("id") Integer id) {
        return this.usuarioService.findById(id);
    }
}
