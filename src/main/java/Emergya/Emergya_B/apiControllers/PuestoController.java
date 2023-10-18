package Emergya.Emergya_B.apiControllers;

import Emergya.Emergya_B.domain.models.Puesto;
import Emergya.Emergya_B.domain.services.PuestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/puesto")
public class PuestoController {

    @Autowired
    private PuestoService puestoService;

    @GetMapping("/disponibles")
    public ResponseEntity<List<Puesto>> obtenerPuestosDisponibles() {
        List<Puesto> puestosDisponibles = puestoService.obtenerPuestosDisponibles();
        return ResponseEntity.ok(puestosDisponibles);
    }

    @PostMapping
    public ResponseEntity<Puesto> crearNuevoPuesto(@RequestBody Puesto puesto) {
        Puesto nuevoPuesto = puestoService.guardarPuesto(puesto);
        return ResponseEntity.ok(nuevoPuesto);
    }
}


