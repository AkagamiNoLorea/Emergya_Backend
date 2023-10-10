
package Emergya.Emergya_B.apiControllers;

import Emergya.Emergya_B.domain.models.Oficina;
import Emergya.Emergya_B.domain.services.OficinaService;
import Emergya.Emergya_B.infrarepositorie.OficinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
    public Oficina getOficinaById(@PathVariable Long id) {
        return (Oficina) OficinaService.findById(Math.toIntExact(id)).orElse(null);
    }

    @PostMapping("/")
    public Oficina createOficina(@RequestBody Oficina oficina) {
        return OficinaService.save(oficina);
    }

    @PutMapping("/{id}")
    public Oficina updateOficina(@PathVariable Long id, @RequestBody Oficina oficinaDetails) {
        Oficina oficina = (Oficina) OficinaService.findById(Math.toIntExact(id)).orElse(null);

        if (oficina != null) {
            oficina.setNombreOficina(oficinaDetails.getNombreOficina());
            oficina.setNumero_asientos(oficinaDetails.getNumero_asientos());
            oficina.setPlano_distribuccion(oficinaDetails.getPlano_distribuccion());
            oficina.setDias_antelacion(oficinaDetails.getDias_antelacion());
            return oficinaRepository.save(oficina);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteOficina(@PathVariable Long id) {
        oficinaRepository.deleteById(Math.toIntExact(id));
    }
}

