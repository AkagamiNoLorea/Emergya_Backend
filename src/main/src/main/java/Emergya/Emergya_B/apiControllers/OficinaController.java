
package Emergya.Emergya_B.apiControllers;

import Emergya.Emergya_B.domain.models.Oficina;
import Emergya.Emergya_B.domain.services.OficinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/oficina")
public class OficinaController {
    @Autowired
    private OficinaService oficinaService;

    @GetMapping
    public List<Oficina> getOficinaController(){
        return oficinaService.getOficina();
    }
    @GetMapping("/{id}")
    public Oficina getOficinaId(@PathVariable Integer id) {
        return oficinaService.getOficinaId(id);
    }


    @PostMapping
    public void createOficina(@RequestBody Oficina oficina){
        oficinaService.newOficina(oficina);
    }

    @PutMapping("/{id}")
    public void updateOficina(@PathVariable Integer id, @RequestBody Oficina oficina){
        oficinaService.update(id, oficina);
    }
    @DeleteMapping("/{id}")
    public void deleteOficina(@PathVariable Integer id) {
        oficinaService.deleteOficina(id);
    }

}