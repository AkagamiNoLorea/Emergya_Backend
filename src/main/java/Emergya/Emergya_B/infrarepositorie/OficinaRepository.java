package Emergya.Emergya_B.infrarepositorie;
/*import org.springframework.stereotype.Repository;*/
import Emergya.Emergya_B.domain.models.Oficina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OficinaRepository extends JpaRepository<Oficina,Integer> {
}
