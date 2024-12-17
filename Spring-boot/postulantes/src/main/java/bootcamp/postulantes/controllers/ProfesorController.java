package bootcamp.postulantes.controllers;

import bootcamp.postulantes.models.ProfesorModel;
import bootcamp.postulantes.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {

    @Autowired
    ProfesorService profesorService;

    @PostMapping()
    public ProfesorModel saveProfesor(@RequestBody ProfesorModel profesor) {
        return this.profesorService.saveProfesor(profesor);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        boolean ok = this.profesorService.deleteProfesor(id);
        return ok ? "Se elimino el profesor" : "No se pudo eliminar";
    }

    @GetMapping
    public ArrayList<ProfesorModel> findAllProfesores() {
        return profesorService.findAllProfesores();
    }

    @GetMapping(path = "/{id}")
    public Optional<ProfesorModel> findProfesorById(@PathVariable("id") Integer id) {
        return this.profesorService.findById(id);
    }
}
