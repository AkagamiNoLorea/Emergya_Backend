package Emergya.Emergya_B.domain.services;

import Emergya.Emergya_B.domain.models.Estado;
import Emergya.Emergya_B.infrarepositorie.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    private final EstadoRepository estadoRepository;

    @Autowired

    public EstadoService (EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }



    public List<Estado> getEstado() {
        return estadoRepository.findAll();
    }

    public void newEstado (Estado estado) {
        estadoRepository.save(estado);
    }

    public void update(Integer id, Estado estado) {

        Optional<Estado> estadoByID = estadoRepository.findById(id); // buscar proyecto por id

        if (estadoByID.isPresent()) {
            Estado estadoExistente = estadoByID.get();

            estadoExistente.setOc_mañana(estado.getOc_mañana());
            estadoExistente.setOc_tarde(estado.getOc_tarde());
            estadoExistente.setOc_todoDia(estado.getOc_todoDia());

            estadoRepository.save(estadoExistente);
        }
    }

    public void deleteEstado(Integer id) {
        boolean existe = estadoRepository.existsById(id);
        if (existe) {
            estadoRepository.deleteById(id);
        }
    }

}

