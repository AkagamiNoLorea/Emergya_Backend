package Emergya.Emergya_B.infrarepositorie;


import Emergya.Emergya_B.domain.models.Oficina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OficinaRepository extends JpaRepository<Oficina,Integer> {
    List<Oficina> findAll();

    Optional<Oficina> finById(Long id);
}
