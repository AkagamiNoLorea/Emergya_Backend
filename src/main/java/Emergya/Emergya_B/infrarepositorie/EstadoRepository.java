package Emergya.Emergya_B.infrarepositorie;

import Emergya.Emergya_B.domain.models.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}


