package bootcamp.postulantes.controllers;

import bootcamp.postulantes.models.BootcampModel;
import bootcamp.postulantes.services.BootcampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/bootcamp")
public class BootcampController {

    @Autowired
    BootcampService bootcampService;

    @PostMapping()
    public BootcampModel saveBootcamp(@RequestBody BootcampModel bootcamp) {
        return this.bootcampService.saveBootcamp(bootcamp);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        boolean ok = this.bootcampService.deleteBootcamp(id);
        return ok ? "Se elimino el bootcamp" : "No se pudo eliminar";
    }

    @GetMapping
    public ArrayList<BootcampModel> findAllBootcamps() {
        return bootcampService.findAllBootcamps();
    }

    @GetMapping(path = "/{id}")
    public Optional<BootcampModel> findBootcampById(@PathVariable("id") Integer id) {
        return this.bootcampService.findById(id);
    }
}
