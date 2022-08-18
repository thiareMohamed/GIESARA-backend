package sn.thiare.GIESARA.backend.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import sn.thiare.GIESARA.backend.model.Abonnement;
import sn.thiare.GIESARA.backend.repository.AbonnementRepository;

import java.util.List;

@Service
@CrossOrigin("*")
public class AbonnementService {

    private AbonnementRepository abonnementRepository;

    public AbonnementService(AbonnementRepository abonnementRepository) {
        this.abonnementRepository = abonnementRepository;
    }

   public Abonnement createAbonnement(Abonnement abonnement){
        return abonnementRepository.save(abonnement);
   }

   public void deleteAbonnement(int id){
        abonnementRepository.deleteById(id);
   }
   public List<Abonnement> getAllAbonnement(){
        return abonnementRepository.findAll();
   }

   public Abonnement getAbonnement(int id){
        return abonnementRepository.findById(id).get();
   }

   public Abonnement updateAbonnement(Abonnement abonnement, int id){
       Abonnement abonnementUpdate = abonnementRepository.findById(id).get();
       abonnementUpdate.setLibelle(abonnement.getLibelle());
       abonnementUpdate.setPrix_unitaire(abonnement.getPrix_unitaire());
        return abonnementRepository.save(abonnementUpdate);
   }

}
