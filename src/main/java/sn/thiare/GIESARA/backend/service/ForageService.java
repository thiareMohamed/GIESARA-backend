package sn.thiare.GIESARA.backend.service;

import org.springframework.stereotype.Service;
import sn.thiare.GIESARA.backend.model.Forage;
import sn.thiare.GIESARA.backend.repository.ForageRepository;

import java.util.List;
@Service
public class ForageService {
    private ForageRepository forageRepository;

    public ForageService(ForageRepository forageRepository) {
        this.forageRepository = forageRepository;
    }

    public List<Forage> getAllForage(){
        return forageRepository.findAll();
    }
    public Forage getForageById(int id){
        return forageRepository.findById(id).orElse(null);
    }
    public void deleteForage(int id){
        forageRepository.deleteById(id);
    }
    public Forage createForage(Forage forage){
        return forageRepository.save(forage);
    }
}
