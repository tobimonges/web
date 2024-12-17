package bootcamp.postulantes.controllers;

import bootcamp.postulantes.models.PostulanteModel;
import bootcamp.postulantes.services.PostulanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/postulantes")
public class PostulanteController {

    @Autowired
    PostulanteService postulanteService;

    @PostMapping()
    public PostulanteModel savePostulante(@RequestBody PostulanteModel postulante) {
        return this.postulanteService.savePostulante(postulante);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        boolean ok = this.postulanteService.deletePostulante(id);
        return ok ? "Se elimino el postulante" : "No se pudo eliminar";
    }

    @GetMapping
    public ArrayList<PostulanteModel> findAllPostulantes() {
        return postulanteService.findAllPostulantes();
    }

    @GetMapping(path = "/id/{id}")
    public Optional<PostulanteModel> findPostulanteById(@PathVariable("id") Integer id) {
        return this.postulanteService.findById(id);
    }

    /*
    @GetMapping("/query")
    public ArrayList<PostulanteModel> findByNroCedula(@RequestParam("ci") Integer ci) {
        return this.postulanteService.findByNroCedula(ci);
    }
     */

    @GetMapping("/cedula/{ci}")
    public Optional<PostulanteModel> findByNroCedula(@PathVariable("ci") Integer ci) {
        return this.postulanteService.findByNroCedula(ci);
    }

}
