package sn.thiare.GIESARA.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.thiare.GIESARA.backend.model.Commune;
import sn.thiare.GIESARA.backend.service.CommuneService;

import java.util.List;

@RestController
public class CommuneController {

    private CommuneService communeService;

    public CommuneController(CommuneService communeService) {
        this.communeService = communeService;
    }

    @GetMapping("/communes")
    public List<Commune> showAll(){
        return communeService.getAllCommune();
    }
    @GetMapping("/communes/{id}")
    public Commune show(int id){
        return communeService.getCommuneById(id);
    }
    @PostMapping("/communes")
    public ResponseEntity<Commune> create(Commune commune){
        return communeService.createCommune(commune);
    }
    @DeleteMapping("/communes/{id}")
    public void delete(int id){
        communeService.deleteCommune(id);
    }
    @PutMapping("/communes/{id}")
    public ResponseEntity<Commune> update(Commune commune, int id){
        commune.setId(id);
        return communeService.createCommune(commune);
    }
}
