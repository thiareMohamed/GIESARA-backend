package sn.thiare.GIESARA.backend.web.rest;

import org.springframework.web.bind.annotation.*;
import sn.thiare.GIESARA.backend.model.Abonnement;
import sn.thiare.GIESARA.backend.service.AbonnementService;

import java.util.List;

@RestController
@CrossOrigin("*")
public class AbonnementController {

    private AbonnementService abonnementService;

    public AbonnementController(AbonnementService abonnementService) {
        this.abonnementService = abonnementService;
    }

    @PostMapping("/abonnements")
    public Abonnement createAbonnement(@RequestBody Abonnement abonnement){
       return abonnementService.createAbonnement(abonnement);
    }

    @GetMapping("/abonnements")
    public List<Abonnement> showAllAbonnement(){
        return abonnementService.getAllAbonnement();
    }

    @GetMapping("/abonnements/{id}")
    public Abonnement showAbonnementById(@PathVariable int id){
        return abonnementService.getAbonnement(id);
    }

    @DeleteMapping("/abonnements/{id}")
    public void delete(@PathVariable int id){
        abonnementService.deleteAbonnement(id);
    }

    @PutMapping("/abonnements/{id}")
    public Abonnement update(@RequestBody Abonnement abonnement, @PathVariable int id){
        return abonnementService.updateAbonnement(abonnement, id);
    }
}
