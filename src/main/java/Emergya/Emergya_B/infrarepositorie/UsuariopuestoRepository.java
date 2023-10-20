package Emergya.Emergya_B.infrarepositorie;


import Emergya.Emergya_B.domain.models.Oficina;
import Emergya.Emergya_B.domain.models.Usuariopuesto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariopuestoRepository extends JpaRepository <Usuariopuesto, Integer> {
}
