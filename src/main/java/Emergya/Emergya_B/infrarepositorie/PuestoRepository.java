package Emergya.Emergya_B.infrarepositorie;
/*import org.springframework.stereotype.Repository;*/
import Emergya.Emergya_B.domain.models.Puesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PuestoRepository extends JpaRepository<Puesto, Integer> {

    @Query(value = "SELECT COUNT(*) FROM PUESTOS where idOficina = :idOficina", nativeQuery = true)
    Integer getNumeroPuestosPorOficina(Integer idOficina);


}
