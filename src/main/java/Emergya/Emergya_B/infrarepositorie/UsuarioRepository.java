package Emergya.Emergya_B.infrarepositorie;
import org.springframework.stereotype.Repository;
import Emergya.Emergya_B.domain.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository< Usuario, Integer> {
}
