package sn.thiare.GIESARA.backend.web.rest;

import org.springframework.web.bind.annotation.*;
import sn.thiare.GIESARA.backend.model.Forage;
import sn.thiare.GIESARA.backend.model.Village;
import sn.thiare.GIESARA.backend.service.ForageService;
import sn.thiare.GIESARA.backend.service.VillageService;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ForageController {

    private ForageService forageService;

    public ForageController(ForageService forageService) {
        this.forageService = forageService;
    }

    @GetMapping("/forages")
    public List<Forage> showAll(){
        return forageService.getAllForage();
    }
    @GetMapping("/forages/{id}")
    public Forage show(@PathVariable int id){
        return forageService.getForageById(id);
    }
    @PostMapping("/forages")
    public Forage create(@RequestBody Forage forage){
        return forageService.createForage(forage);
    }
    @DeleteMapping("/forages/{id}")
    public void delete(@PathVariable int id){
        forageService.deleteForage(id);
    }
    @PutMapping("/forages/{id}")
    public Forage update(@RequestBody Forage forage, @PathVariable int id){
        forage.setId(id);
        return forageService.createForage(forage);
    }
}
