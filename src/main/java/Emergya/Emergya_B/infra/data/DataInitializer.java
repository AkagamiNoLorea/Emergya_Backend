package Emergya.Emergya_B.infra.data;

import Emergya.Emergya_B.domain.models.Oficina;
import Emergya.Emergya_B.domain.models.Puesto;
import Emergya.Emergya_B.domain.models.Usuario;
import Emergya.Emergya_B.infrarepositorie.OficinaRepository;
import Emergya.Emergya_B.infrarepositorie.PuestoRepository;
import Emergya.Emergya_B.infrarepositorie.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private OficinaRepository oficinaRepository;

    @Autowired
    private PuestoRepository puestoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) throws Exception {


        for (int i = 1; i <= 4; i++) {
            Oficina oficina = new Oficina("Oficina " + i, 0 + i, "Plano " + i, 0 + i);
            oficinaRepository.save(oficina);

            for (int j = 1; j <= 20; j++) {
                Puesto puesto = new Puesto(1, true, 0+j, null);
                puesto.setOficina(oficina);

                puestoRepository.save(puesto);
            }
        }

        for (int k = 1; k <= 18; k++) {
            Usuario usuario = new Usuario();
            usuario.setNombre("Usuario " + k);

            usuarioRepository.save(usuario);
        }
    }
}
