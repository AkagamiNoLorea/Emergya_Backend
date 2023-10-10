package Emergya.Emergya_B.domain.services;

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

    public static List<Oficina> findAll() {
        return null;
    }

    public static Optional<Object> findById(int toIntExact) {
    }

    public List<Oficina>getAllOficinas() {
        return oficinaRepository.findAll();
    }

    public Optional<Oficina>getOficinaById(Long id){
        return oficinaRepository.finById(id);
    }

    public Optional<Oficina>updateOficina(Long id, Oficina oficinaDetails){
        Optional<Oficina>optionalOficina = oficinaRepository.findById(id);

        if (optionalOficina.isPresent()) {
            Oficina oficina = optionalOficina.get();
            oficina.setNombreOficina(oficinaDetails.getNombreOficina());
            oficina.setNumero_asientos(oficinaDetails.getNumero_asientos());

            oficina.setPlano_distribuccion(oficinaDetails.getPlano_distribucion());
            oficina.setDias_antelacion(oficinaDetails.getDias_antelacion());

            return Optional.of(oficinaRepository.save(oficina));
        }
        public void deleteOficial(id){
            oficinaRepository.deleteById(Math.toIntExact(id));
        }
    }
}
