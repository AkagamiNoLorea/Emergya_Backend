package Emergya.Emergya_B.apiControllers;

import Emergya.Emergya_B.domain.models.Usuario;
import Emergya.Emergya_B.domain.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getUsuarios() {
        return usuarioService.getUsuarios();
    }

    @PostMapping
    public void createUsuario(@RequestBody Usuario usuario) {
        usuarioService.createUsuario(usuario);
    }

    @PutMapping("/{id}")
    public void updateUsuario(@PathVariable Integer id, @RequestBody Usuario usuario) {
        usuarioService.updateUsuario(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Integer id) {
        usuarioService.deleteUsuario(id);
    }
}
