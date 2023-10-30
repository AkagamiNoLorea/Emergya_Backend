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

    public List<Usuariopuesto> getUsuariopuesto(){
        return usuariopuestoService.getUsuarioPuesto();
    }

    @PostMapping
    public void createUsuariopuesto (@RequestBody Usuariopuesto usuariopuesto){
        usuariopuestoService.createUsuariopuesto(usuariopuesto);
    }

    @PutMapping("/{id}")
    public void updateUsuariopuesto (@PathVariable Integer id, @RequestBody Usuariopuesto usuariopuesto){
        usuariopuestoService.updateUsuariopuesto(id, usuariopuesto);
    }

}