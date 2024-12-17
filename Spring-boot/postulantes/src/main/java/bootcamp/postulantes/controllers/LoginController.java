package bootcamp.postulantes.controllers;

import bootcamp.postulantes.models.LoginModel;
import bootcamp.postulantes.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping()
    public LoginModel saveLogin(@RequestBody LoginModel login) {
        return this.loginService.saveLogin(login);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        boolean ok = this.loginService.deleteLogin(id);
        return ok ? "Se elimino el login" : "No se pudo eliminar";
    }

    @GetMapping
    public ArrayList<LoginModel> findAllLogins() {
        return loginService.findAllLogins();
    }

    @GetMapping(path = "/{id}")
    public Optional<LoginModel> findLoginById(@PathVariable("id") Integer id) {
        return this.loginService.findById(id);
    }
}
