package Emergya.Emergya_B.domain.services;

import Emergya.Emergya_B.domain.models.Usuariopuesto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsuariopuestoService {

    public static java.util.List<Usuariopuesto> usuariopuesto;

    @Autowired

    public UsuariopuestoService (){
        
    }

    public static void newUsuariopuesto(Usuariopuesto usuariopuesto) {
    }

    public static java.util.List<Usuariopuesto> getUsuariopuesto() {
        return usuariopuesto;
    }

    public void update(Integer id, List<Usuariopuesto> usuariopuesto) {
        UsuariopuestoService.usuariopuesto = usuariopuesto;
    }
}
