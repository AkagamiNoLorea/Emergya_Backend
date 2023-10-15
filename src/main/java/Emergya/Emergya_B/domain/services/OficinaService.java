/*package Emergya.Emergya_B.domain.services;


import Emergya.Emergya_B.domain.models.Oficina;
import Emergya.Emergya_B.infrarepositorie.OficinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OficinaService {

    @Autowired
    private OficinaRepository oficinaRepository;

    public static void findById(Integer id) {
    }

    public static List<Oficina> findAll() {
        return null;
    }

    public static Oficina updateOficina() {
        return null;
    }

    public static Object orElse(Object o) {

        return o;
    }

    public List<Oficina> getAllOficinas() {
        return oficinaRepository.findAll();
    }

    public Optional<Oficina> getOficinaById(Long id) {
        return oficinaRepository.findById(id);
    }

    public Oficina createOficina(Oficina oficina) {
        return oficinaRepository.save(oficina);
    }

    public Optional<Oficina> updateOficina(Long id, Oficina oficinaDetails) {
        Optional<Oficina> optionalOficina = oficinaRepository.findById(id);

        if (optionalOficina.isPresent()) {
            Oficina oficina = optionalOficina.get();
            oficina.setNombreOficina(oficinaDetails.getNombreOficina());
            oficina.setPuesto();
            oficina.setPlano_distribuccion(oficinaDetails.getPlano_distribuccion());
            oficina.setDias_antelacion(oficinaDetails.getDias_antelacion());

            return Optional.of(oficinaRepository.save(oficina));
        }

        return Optional.empty();
    }

    public void deleteOficina(Long id) {
        oficinaRepository.deleteById(id);
    }
}
*/