/*
package Emergya.Emergya_B.apiControllers;

import Emergya.Emergya_B.domain.models.Oficina;
import Emergya.Emergya_B.domain.services.OficinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/oficinas")
public class OficinaController {
    @Autowired
    private OficinaService oficinaService;

    @GetMapping("/")
    public List<Oficina> getAllOficinas() {
        return OficinaService.findAll();
    }

    @GetMapping("/{id}")
    public Oficina getOficinaById(@PathVariable Integer id) {
        Oficina oficina = (Oficina) OficinaService.orElse(null);
        return oficina;
    }

    @PostMapping("/")
    public Oficina createOficina(@RequestBody Oficina oficina) {
        return OficinaService.updateOficina();
    }

    @PutMapping("/{id}")
    public Optional<Oficina> updateOficina(@PathVariable Integer id, @RequestBody Oficina oficinaDetails) {
        Oficina oficina = (Oficina) OficinaService.updateOficina();

        if (oficina != null) {
            oficina.setNombreOficina(oficinaDetails.getNombreOficina());
            oficina.setPuesto();
            oficina.setPlano_distribuccion(oficinaDetails.getPlano_distribuccion());
            oficina.setDias_antelacion(oficinaDetails.getDias_antelacion());
            return oficinaService.updateOficina(Long.valueOf(id), oficina);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteOficina(@PathVariable Integer id) {
        oficinaService.deleteOficina(Long.valueOf(id));
    }
}
*/

package Emergya.Emergya_B.apiControllers;

import Emergya.Emergya_B.domain.models.Oficina;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class OficinaController {

    @GetMapping(path = "/")
    public List<Oficina> getOficina() {
        return List.of(
                new Oficina(
                        1,
                        "Emergya",
                        "22",
                        "al lado del baño",
                        "12 dias"
                )
        );
    }
}
