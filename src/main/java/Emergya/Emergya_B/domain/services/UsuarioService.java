package Emergya.Emergya_B.domain.services;

import Emergya.Emergya_B.domain.models.Oficina;
import Emergya.Emergya_B.domain.models.Puesto;
import Emergya.Emergya_B.domain.models.Usuario;
import Emergya.Emergya_B.infrarepositorie.PuestoRepository;
import Emergya.Emergya_B.infrarepositorie.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }

    public void createUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void updateUsuario(Integer id, Usuario usuario) {
        Optional<Usuario> usuarioById = usuarioRepository.findById(id);
        if (usuarioById.isPresent()) {
            Usuario existente = usuarioById.get();
            existente.setNombre(usuario.getNombre());
            existente.setEmail(usuario.getEmail());
            existente.setEmpresa(usuario.getEmpresa());
            existente.setIsAdmin(usuario.getIsAdmin());// roles para luego
            usuarioRepository.save(existente);
        }
    }

    public void deleteUsuario(Integer id) {
        boolean existe = usuarioRepository.existsById(id);
        if (existe) {
            usuarioRepository.deleteById(id);
        }
    }

    public Usuario getUsuarioId(Integer id){

        Optional<Usuario> usuarioById = usuarioRepository.findById(id);
        return usuarioById.get();
    }
}
