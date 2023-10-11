package Emergya.Emergya_B.domain.services;

import Emergya.Emergya_B.domain.models.Estado;
import Emergya.Emergya_B.infrarepositorie.EstadoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    private final EstadoRepository estadoRepository;

    public EstadoService(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }

    public Optional<Estado> findById(Integer id) {
        return estadoRepository.findById(id);
    }


    @Transactional
    public Estado save(Estado estado) {
        return estadoRepository.save(estado);
    }

    @Transactional
    public void deleteById(Integer id) {
        estadoRepository.deleteById(id);
    }

    public void update(Integer id, Estado estado) {
    }

    public void deletebook(Integer id) {
    }

    public void newEstado(Estado estado) {
       return estadoRepository.save(estado);
    }

    public List<Estado> getBook() {
        return null;
    }
}

