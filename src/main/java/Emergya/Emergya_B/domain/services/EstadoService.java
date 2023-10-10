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



    public List<Estado> getBook() {
        return estadoRepository.findAll(); // SELECT * FROM proyectos
    }

    public void newEstado (Estado estado) {
        estadoRepository.save(estado);
    }

    public void update(Integer id, Estado estado) {

        Optional<Estado> bookByID = estadoRepository.findById(id); // buscar proyecto por id

        if (bookByID.isPresent()) {
            Estado bookExistente = bookByID.get();

            bookExistente.setOc_mañana(estado.getOc_mañana());
            bookExistente.setOc_tarde(estado.getOc_tarde());

            estadoRepository.save(bookExistente);
        }
    }

    public void deletebook(Integer id) {
        boolean existe = estadoRepository.existsById(id);
        if (existe) {
            estadoRepository.deleteById(id);
        }
    }

}
