package Emergya.Emergya_B.apiControllers;

import Emergya.Emergya_B.domain.models.Puesto;
import Emergya.Emergya_B.domain.services.PuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/puesto")
public class PuestoController {

    private final PuestoService puestoService;

    @Autowired
    public PuestoController(PuestoService puestoService) {
        this.puestoService = puestoService;
    }

    @GetMapping
    public List<Puesto> getPuesto() {
        return puestoService.getPuestos();
    }

    @PostMapping
    public void createPuesto(@RequestBody Puesto puesto) {
        puestoService.createPuesto(puesto);
    }

    @PutMapping("/{id}")
    public void updatePuesto(@PathVariable Integer id, @RequestBody Puesto puesto) {
        puestoService.updatePuesto(id, puesto);
    }

    @DeleteMapping("/{id}")
    public void deletePuesto(@PathVariable Integer id) {
        puestoService.deletePuesto(id);
    }
}
