package sn.thiare.GIESARA.backend.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import sn.thiare.GIESARA.backend.model.Commune;
import sn.thiare.GIESARA.backend.repository.CommuneRepository;

import java.net.URI;
import java.util.List;
import java.util.Objects;

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
    public ResponseEntity<Commune> createCommune(Commune commune){
        Commune communeAdded = communeRepository.save(commune);
        if (Objects.isNull(communeAdded)) {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(communeAdded.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
