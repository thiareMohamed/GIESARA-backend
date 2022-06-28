package sn.thiare.GIESARA.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.thiare.GIESARA.backend.model.Village;
import sn.thiare.GIESARA.backend.service.VillageService;

import java.util.List;

//@RestController
public class VillageController {

    private VillageService villageService;

    public VillageController(VillageService villageService) {
        this.villageService = villageService;
    }

    @GetMapping("/villages")
    public List<Village> showAll(){
        return villageService.getAllVillage();
    }
    @GetMapping("/villages/{id}")
    public Village show(@PathVariable int id){
        return villageService.getVillageById(id);
    }
    @PostMapping("/villages")
    public ResponseEntity<Village> create(@RequestBody Village village){
       return villageService.createVillage(village);
    }
    @DeleteMapping("/villages/{id}")
    public void delete(@PathVariable int id){
        villageService.deleteVillage(id);
    }
    @PutMapping("/villages/{id}")
    public ResponseEntity<Village> update(@RequestBody Village village,@PathVariable int id){
        village.setId(id);
        return villageService.createVillage(village);
    }
}
