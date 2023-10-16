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

    public List<Puesto> getPuestos() {
        return puestoRepository.findAll();
    }

    public void createPuesto(Puesto puesto) {
        puestoRepository.save(puesto);
    }

    public void updatePuesto(Integer id, Puesto puesto) {
        Optional<Puesto> puestoById = puestoRepository.findById(id);
        if (puestoById.isPresent()) {
            Puesto existente = puestoById.get();
            existente.setIdOficina(puesto.getIdOficina()); // Cambia el nombre del método
            existente.setDisponible(puesto.getDisponible());
            existente.setNumero(puesto.getNumero());
            existente.setIdEstado(puesto.getIdEstado()); // Agrega el método para el estado
            puestoRepository.save(existente);
        }
    }

    public void deletePuesto(Integer id) {
        boolean existe = puestoRepository.existsById(id);
        if (existe) {
            puestoRepository.deleteById(id);
        }
    }
}
