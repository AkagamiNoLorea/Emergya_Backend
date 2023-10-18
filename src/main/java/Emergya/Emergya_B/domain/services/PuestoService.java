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


    public List<Puesto> obtenerPuestosDisponibles() {

        return puestoRepository.findAllByDisponibleTrue();
    }


    public Puesto guardarPuesto(Puesto puesto) {
        return puestoRepository.save(puesto);
    }


    public List<Puesto> obtenerTodosLosPuestos() {
        return puestoRepository.findAll();
    }


    public Optional<Puesto> obtenerPuestoPorId(Long id) {
        return puestoRepository.findById(id);
    }


    public void eliminarPuesto(Long id) {
        puestoRepository.deleteById(id);
    }
}

