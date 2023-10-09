package Emergya.Emergya_B.domain.services;

import Emergya.Emergya_B.domain.models.EstadoPuesto;
import Emergya.Emergya_B.domain.models.Puesto;
import Emergya.Emergya_B.infrarepositorie.PuestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PuestoService {
    @Autowired
    private PuestoRepository puestoRepository;

    public List<Puesto> obtenerPuestosDisponibles() {
        return puestoRepository.findByEstado(EstadoPuesto.DISPONIBLE);
    }

    public Puesto obtenerPuestoPorId(Long id) {
        return puestoRepository.findById(id);

    }

    public Puesto reservarPuesto(Long id, EstadoPuesto nuevoEstado) {
        Puesto puesto = obtenerPuestoPorId(id);
        puesto.setEstado(nuevoEstado);
        return puestoRepository.save(puesto);
    }

    public Puesto liberarPuesto(Long id) {
        Puesto puesto = obtenerPuestoPorId(id);
        puesto.setEstado(EstadoPuesto.DISPONIBLE);
        return puestoRepository.save(puesto);
    }

    public List<Puesto> obtenerPuestosPorOficina(Long oficinaId) {
        return puestoRepository.findByOficinaId(oficinaId);
    }

    // los metodos para el crud no son necesarios para CRUD ya que se van a gestionar dentro de "oficina"
}