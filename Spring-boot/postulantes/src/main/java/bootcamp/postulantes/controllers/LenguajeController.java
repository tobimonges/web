package bootcamp.postulantes.controllers;

import bootcamp.postulantes.models.LenguajeModel;
import bootcamp.postulantes.services.LenguajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/lenguaje")
public class LenguajeController {

    @Autowired
    LenguajeService lenguajeService;

    @PostMapping()
    public LenguajeModel saveLenguaje(@RequestBody LenguajeModel lenguaje) {
        return this.lenguajeService.saveLenguaje(lenguaje);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        boolean ok = this.lenguajeService.deleteLenguaje(id);
        return ok ? "Se elimino el lenguaje" : "No se pudo eliminar";
    }

    @GetMapping
    public ArrayList<LenguajeModel> findAllLenguajes() {
        return lenguajeService.findAllLenguajes();
    }

    @GetMapping(path = "/{id}")
    public Optional<LenguajeModel> findLenguajeById(@PathVariable("id") Integer id) {
        return this.lenguajeService.findById(id);
    }
}
