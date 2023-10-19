package Emergya.Emergya_B.apiControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class EstadoController {

    private final EstadoService estadoService;

    @Autowired

    public EstadoController(EstadoService estadoService){
        this.estadoService = estadoService;
    }

    @GetMapping
    public List<Estado> getEstadoController(){
        return estadoService.getEstado();
    }

    @PostMapping
    public void createEstado(@RequestBody Estado estado){
        estadoService.newEstado(estado);
    }

    @PutMapping("/{di")
    public void updateEstado(@PathVariable Integer id){
        estadoService.deleteEstado(id);
    }
}
