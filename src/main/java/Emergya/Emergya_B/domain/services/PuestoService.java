package Emergya.Emergya_B.domain.services;

import Emergya.Emergya_B.domain.models.Oficina;
import Emergya.Emergya_B.domain.models.Puesto;
import Emergya.Emergya_B.infrarepositorie.PuestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PuestoService {
    @Autowired
    private PuestoRepository puestoRepository;
    @Autowired
    private OficinaService oficinaService;
    public List<Puesto> getPuestos() {
        return puestoRepository.findAll();
    }

    public void createPuesto(Puesto puesto) throws Exception {
        Integer numPuestos = getNumeroPuestosPorOficina(puesto.getIdOficina());
        Oficina oficina = oficinaService.getOficinaId(puesto.getIdOficina());
        if(numPuestos<oficina.getPuesto()){
            puestoRepository.save(puesto);
        }else{
            throw new Exception("No se pueden crear mas puestos en la oficina");
        }

    }

    public void updatePuesto(Integer id, Puesto puesto) {
        Optional<Puesto> puestoById = puestoRepository.findById(id);
        if (puestoById.isPresent()) {
            Puesto existente = puestoById.get();
            existente.setIdOficina(puesto.getIdOficina()); // Cambia el nombre del método
            existente.setDisponible(puesto.getDisponible());
            existente.setNumero(puesto.getNumero());
            existente.setIdEstado(puesto.getIdEstado()); // Agrega el método para el estado
            puestoRepository.save(existente);
        }
    }

    public void deletePuesto(Integer id) {
        boolean existe = puestoRepository.existsById(id);
        if (existe) {
            puestoRepository.deleteById(id);
        }
    }

    public Integer getNumeroPuestosPorOficina(Integer idOficina) {
        return puestoRepository.getNumeroPuestosPorOficina(idOficina);

    }
    public Puesto getPuestoById(Integer id){

        Optional<Puesto> puestoById = puestoRepository.findById(id);
        return puestoById.get();
    }

    public List<Puesto> findByIdOficina(Integer idOficina){
        return puestoRepository.findByIdOficina(idOficina);
    }
}
