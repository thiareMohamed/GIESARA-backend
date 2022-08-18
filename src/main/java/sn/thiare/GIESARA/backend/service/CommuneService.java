package sn.thiare.GIESARA.backend.service;

import org.springframework.stereotype.Service;
import sn.thiare.GIESARA.backend.model.Commune;
import sn.thiare.GIESARA.backend.repository.CommuneRepository;

import java.util.List;

@Service
public class CommuneService {
    private CommuneRepository communeRepository;

    public CommuneService(CommuneRepository communeRepository) {
        this.communeRepository = communeRepository;
    }

    public List<Commune> getAllCommune(){
        return communeRepository.findAll();
    }
    public Commune getCommuneById(int id){
        return communeRepository.findById(id).orElse(null);
    }
    public void deleteCommune(int id){
        communeRepository.deleteById(id);
    }
    public Commune createCommune(Commune commune){
        return communeRepository.save(commune);
//        if (Objects.isNull(communeAdded)) {
//            return ResponseEntity.noContent().build();
//        }
//        URI location = ServletUriComponentsBuilder
//                .fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(communeAdded.getId())
//                .toUri();
//        return ResponseEntity.created(location).build();
    }
}
