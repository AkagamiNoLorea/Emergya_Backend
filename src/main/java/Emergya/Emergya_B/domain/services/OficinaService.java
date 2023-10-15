package Emergya.Emergya_B.domain.services;

import Emergya.Emergya_B.domain.models.Oficina;
import Emergya.Emergya_B.infrarepositorie.OficinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OficinaService {

    private static OficinaRepository oficinaRepository;
    @Autowired

    public OficinaService(OficinaRepository oficinaRepository) {
        OficinaService.oficinaRepository = oficinaRepository;
    }



    public static List<Oficina> getOficina(){
        return oficinaRepository.findAll();
    }

}
