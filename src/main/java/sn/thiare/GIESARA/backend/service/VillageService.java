package sn.thiare.GIESARA.backend.service;

import org.springframework.stereotype.Service;
import sn.thiare.GIESARA.backend.model.Village;
import sn.thiare.GIESARA.backend.repository.VillageRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class VillageService {
    private VillageRepository villageRepository;
    private CommuneService communeService;

    public VillageService(VillageRepository villageRepository,
                          CommuneService communeService) {
        this.villageRepository = villageRepository;
    }

    public List<Village> getAllVillage(){
        return villageRepository.findAll();
    }
    public Village getVillageById(int id){
        return villageRepository.findById(id).orElse(null);
    }
    public void deleteVillage(int id){
        villageRepository.deleteById(id);
    }
    public Village createVillage(Village village){
        village.setCompteur(new ArrayList<>());
        villageRepository.save(village);
        return village;
    }

    public Village createVillageService(Village village){
        Village villageAdded = new Village();
        villageAdded.setNom(village.getNom());
        villageAdded.setCompteur(new ArrayList<>());
        return villageRepository.save(villageAdded);
    }
}
