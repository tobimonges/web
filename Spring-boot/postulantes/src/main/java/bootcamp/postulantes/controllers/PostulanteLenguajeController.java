package bootcamp.postulantes.controllers;

import bootcamp.postulantes.models.PostulanteLenguajeModel;
import bootcamp.postulantes.services.PostulanteLenguajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/postulanteLenguaje")
public class PostulanteLenguajeController {

    @Autowired
    PostulanteLenguajeService postulanteLenguajeService;

    @PostMapping()
    public PostulanteLenguajeModel savePostulanteLenguaje(@RequestBody PostulanteLenguajeModel postulanteLenguaje) {
        return this.postulanteLenguajeService.savePostulanteLenguaje(postulanteLenguaje);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        boolean ok = this.postulanteLenguajeService.deletePostulanteLenguaje(id);
        return ok ? "Se elimino el postulanteLenguaje" : "No se pudo eliminar";
    }

    @GetMapping
    public ArrayList<PostulanteLenguajeModel> findAllPostulanteLenguajes() {
        return postulanteLenguajeService.findAllPostulanteLenguajes();
    }

    @GetMapping(path = "/{id}")
    public Optional<PostulanteLenguajeModel> findPostulanteLenguajeById(@PathVariable("id") Integer id) {
        return this.postulanteLenguajeService.findById(id);
    }
}
