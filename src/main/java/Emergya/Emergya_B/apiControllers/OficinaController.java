
package Emergya.Emergya_B.apiControllers;

import Emergya.Emergya_B.domain.models.Oficina;
import Emergya.Emergya_B.domain.services.OficinaService;
import Emergya.Emergya_B.infrarepositorie.OficinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/oficinas")
public class OficinaController {
    @Autowired
    private OficinaRepository oficinaRepository;

    @GetMapping("/")
    public List<Oficina> getAllOficinas() {
        return oficinaRepository.findAll();
    }

    @Autowired
    private OficinaService oficinaService;  // Asegúrate de que esté autowireado correctamente.

    public ResponseEntity<Oficina> getOficinaById(@PathVariable Integer id) {
        Optional<Oficina> optionalOficina = oficinaService.findById(id);
        if (optionalOficina.isPresent()) {
            return ResponseEntity.ok(optionalOficina.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/")
    public Oficina createOficina(@RequestBody Oficina oficina) {
        return oficinaRepository.save(oficina);
    }

    @PutMapping("/{id}")
    public Oficina updateOficina(@PathVariable Long id, @RequestBody Oficina oficinaDetails) {
        Oficina oficina = oficinaRepository.findById(id).orElse(null);

        if (oficina != null) {
            oficina.setNombreOficina(oficinaDetails.getNombreOficina());
            oficina.setNumero_asientos(oficinaDetails.getNumeroAsientos());
            oficina.getPlano_distribucion(oficinaDetails.getPlanoDistribucion());
            oficina.setDias_antelacion(oficinaDetails.getDiasAntelacion());
            return oficinaRepository.save(oficina);
        }

        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteOficina(@PathVariable Long id) {
        oficinaRepository.deleteById(id);
    }
}

