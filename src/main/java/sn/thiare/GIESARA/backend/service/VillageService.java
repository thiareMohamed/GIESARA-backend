package sn.thiare.GIESARA.backend.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import sn.thiare.GIESARA.backend.model.Village;
import sn.thiare.GIESARA.backend.repository.VillageRepository;

import java.net.URI;
import java.util.List;
import java.util.Objects;

@Service
public class VillageService {
    private VillageRepository villageRepository;

    public VillageService(VillageRepository villageRepository) {
        this.villageRepository = villageRepository;
    }

    public List<Village> getAllVillage(){
        return villageRepository.findAll();
    }
    public Village getVillageById(@PathVariable int id){
        return villageRepository.findById(id).orElse(null);
    }
    public void deleteVillage(@PathVariable int id){
        villageRepository.deleteById(id);
    }
    public ResponseEntity<Village> createVillage(@PathVariable Village village){
        Village villageAdded = villageRepository.save(village);
        if (Objects.isNull(villageAdded)) {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(villageAdded.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
