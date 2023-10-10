
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
        return (Oficina) OficinaService.findById(Math.toIntExact(id)).orElse(null);
    }

    @PostMapping("/")
    public Oficina createOficina(@RequestBody Oficina oficina) {
        return OficinaService.updateOficina(oficina);
    }

    @PutMapping("/{id}")
    public Optional<Oficina> updateOficina(@PathVariable Integer id, @RequestBody Oficina oficinaDetails) {
        Oficina oficina = (Oficina) OficinaService.findById(id).orElse(null);

        if (oficina != null) {
            oficina.setNombreOficina(oficinaDetails.getNombreOficina());
            oficina.setNumero_asientos(oficinaDetails.getNumero_asientos());
            oficina.setPlano_distribuccion(oficinaDetails.getPlano_distribuccion());
            oficina.setDias_antelacion(oficinaDetails.getDias_antelacion());
            return oficinaService.updateOficina(id, oficina);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteOficina(@PathVariable Integer id) {
        oficinaService.deleteOficina(id);
    }
}

