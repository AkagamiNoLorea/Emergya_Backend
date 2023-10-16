package Emergya.Emergya_B.apiControllers;

import Emergya.Emergya_B.domain.models.Oficina;
import Emergya.Emergya_B.domain.services.OficinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Oficina")

public class OficinaController {

    private final OficinaService oficinaService;

   @Autowired

    public OficinaController(OficinaService oficinaService) {
        this.oficinaService = oficinaService;
    }

    @GetMapping
    public List<Oficina> getOficinaController(){
       return OficinaService.getOficina();
    }

@PostMapping
    public void createOficina(@RequestBody Oficina oficina){
       OficinaService.newOficina(oficina);
}

@PutMapping("/{id}")
    public void updateOficina(@PathVariable Integer id, @RequestBody Oficina oficina){
       oficinaService.update(id, oficina);
}

}
