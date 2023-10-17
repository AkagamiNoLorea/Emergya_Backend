package Emergya.Emergya_B.apiControllers;


import Emergya.Emergya_B.domain.models.Usuariopuesto;
import Emergya.Emergya_B.domain.services.UsuariopuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Usuariopuesto")


public class UsuariopuestoController {

    private final UsuariopuestoService usuariopuestoService;

@Autowired

    public UsuariopuestoController(UsuariopuestoService usuariopuestoService) {

    this.usuariopuestoService = usuariopuestoService;
}

@GetMapping

    public List<Usuariopuesto> getUsuariopuestoController(){
    return UsuariopuestoService.getUsuariopuesto();
}

@PostMapping
    public void createUsuariopuesto(@RequestBody Usuariopuesto usuariopuesto){
    UsuariopuestoService.newUsuariopuesto(usuariopuesto);
}

@PutMapping("/{id}")
    public void updateUsuario(@PathVariable Integer id, @RequestBody List<Usuariopuesto> usuariopuesto){
    usuariopuestoService.update(id, usuariopuesto);
}

}
