package Emergya.Emergya_B.infrarepositorie;
/*import org.springframework.stereotype.Repository;*/
import Emergya.Emergya_B.domain.models.EstadoPuesto;
import Emergya.Emergya_B.domain.models.Puesto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PuestoRepository extends JpaRepository<Puesto, Integer> {
    List<Puesto> findByEstado(EstadoPuesto estadoPuesto);

    List<Puesto> findByOficinaId(Long oficinaId);

    Puesto findById(Long id);
}
