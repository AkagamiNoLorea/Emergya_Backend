package Emergya.Emergya_B.apiControllers;

import Emergya.Emergya_B.domain.models.Estado;
import Emergya.Emergya_B.domain.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/estado")
public class EstadoController {

    private final EstadoService estadoService;

    @Autowired

    public EstadoController(EstadoService estadoService){
        this.estadoService = estadoService;

    }

    @GetMapping
    public List<Estado> getEstadoController(){ return  estadoService.getEstado();
    }

    @PostMapping
    public void createEstado(@RequestBody Estado estado){
        estadoService.newEstado(estado);
    }

    @PutMapping("/{id}")
    public void updateEstado(@PathVariable Integer id, @RequestBody Estado estado){
        estadoService.update(id, estado);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        estadoService.deleteEstado(id);

    }

}