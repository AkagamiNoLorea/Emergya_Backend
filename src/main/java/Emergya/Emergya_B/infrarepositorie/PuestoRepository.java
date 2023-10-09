package Emergya.Emergya_B.infrarepositorie;
/*import org.springframework.stereotype.Repository;*/
import Emergya.Emergya_B.domain.models.Puesto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PuestoRepository extends JpaRepository<Puesto, Integer> {
}
