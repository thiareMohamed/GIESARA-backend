package sn.thiare.GIESARA.backend.web.rest;

import org.springframework.web.bind.annotation.*;
import sn.thiare.GIESARA.backend.dto.AddCompteurDto;
import sn.thiare.GIESARA.backend.model.Compteur;
import sn.thiare.GIESARA.backend.service.CompteurService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class CompteurController {

    private CompteurService compteurService;

    public CompteurController(CompteurService villageService) {
        this.compteurService = villageService;
    }

    @GetMapping("/compteurs")
    public List<Compteur> showAll(){
        return compteurService.getAllCompteur();
    }
    @GetMapping("/compteurs/{id}")
    public Optional<Compteur> show(@PathVariable int id){
        return compteurService.findCompteurById(id);
    }
    @PostMapping("/compteurs")
    public Compteur create(@RequestBody AddCompteurDto addCompteurDto){
       return compteurService.createCompteur(addCompteurDto);
    }
    @DeleteMapping("/compteurs/{id}")
    public void delete(@PathVariable int id){
        compteurService.deleteCompteur(id);
    }
    @PutMapping("/compteurs/{id}")
    public Compteur update(@RequestBody Compteur compteur, @PathVariable int id){
        compteur.setId(id);
        return compteurService.updateCompteur(compteur);
    }
}
