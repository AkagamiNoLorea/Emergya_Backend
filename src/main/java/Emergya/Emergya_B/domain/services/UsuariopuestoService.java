package Emergya.Emergya_B.domain.services;

import Emergya.Emergya_B.domain.models.Puesto;
import Emergya.Emergya_B.domain.models.Usuariopuesto;
import Emergya.Emergya_B.infrarepositorie.UsuariopuestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariopuestoService {

    private final UsuariopuestoRepository usuariopuestoRepository;

    @Autowired

    public UsuariopuestoService (UsuariopuestoRepository usuariopuestoRepository){
        this.usuariopuestoRepository = usuariopuestoRepository;

    }

    public List<Usuariopuesto> getUsuarioPuesto() {
        return usuariopuestoRepository.findAll();
    }

    public void createUsuariopuesto(Usuariopuesto usuariopuesto) {
        usuariopuestoRepository.save(usuariopuesto);
    }



    public void updateUsuariopuesto(Integer id, Usuariopuesto usuariopuesto) {
        Optional<Usuariopuesto> usuariopuestoById = usuariopuestoRepository.findById(id);
        if (usuariopuestoById.isPresent()) {
            Usuariopuesto existente = usuariopuestoById.get();
            existente.setIdUsuario(usuariopuesto.getIdUsuario());
            existente.setIdPuesto(usuariopuesto.getIdPuesto());
            existente.setFranjaHorario(usuariopuesto.getFranjaHorario());
            existente.setFecha(usuariopuesto.getFecha());
            usuariopuestoRepository.save(existente);
        }
    }

    public void deleteUsuariopuesto (Integer id) {
        boolean existe = usuariopuestoRepository.existsById(id);
        if (existe) {
            usuariopuestoRepository.deleteById(id);
        }
    }
}