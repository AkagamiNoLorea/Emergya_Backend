package Emergya.Emergya_B.domain.services;

import Emergya.Emergya_B.domain.models.Puesto;
import Emergya.Emergya_B.infrarepositorie.PuestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PuestoService {

    private final PuestoRepository puestoRepository;

    @Autowired
    public PuestoService(PuestoRepository puestoRepository) {
        this.puestoRepository = puestoRepository;
    }

    // Método para obtener los puestos disponibles.
    public List<Puesto> obtenerPuestosDisponibles() {
        // Asumo que tienes un método en tu repository que te devuelve los puestos disponibles.
        // Si no lo tienes, deberás crear uno.
        return puestoRepository.findAllByDisponibleTrue();
    }

    // Método para guardar un nuevo puesto.
    public Puesto guardarPuesto(Puesto puesto) {
        return puestoRepository.save(puesto);
    }

    // Método para obtener todos los puestos.
    public List<Puesto> obtenerTodosLosPuestos() {
        return puestoRepository.findAll();
    }

    // Método para obtener un puesto específico por su ID.
    public Optional<Puesto> obtenerPuestoPorId(Long id) {
        return puestoRepository.findById(id);
    }

    // Método para eliminar un puesto por su ID.
    public void eliminarPuesto(Long id) {
        puestoRepository.deleteById(id);
    }
}

