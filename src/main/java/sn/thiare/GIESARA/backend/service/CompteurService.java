package sn.thiare.GIESARA.backend.service;

import org.springframework.stereotype.Service;
import sn.thiare.GIESARA.backend.dto.AddCompteurDto;
import sn.thiare.GIESARA.backend.model.Compteur;
import sn.thiare.GIESARA.backend.repository.*;

import java.util.List;
import java.util.Optional;

@Service
public class CompteurService {

    private final CompteurRepository compteurRepository;

    private final ForageRepository forageRepository;
    private final AbonnementRepository abonnementRepository;
    private final ClientRepository clientRepository;
    private final VillageRepository villageRepository;

    public CompteurService(CompteurRepository compteurRepository,
                           ForageRepository forageRepository,
                           AbonnementRepository abonnementRepository,
                           ClientRepository clientRepository,
                           VillageRepository villageRepository) {
        this.compteurRepository = compteurRepository;
        this.forageRepository = forageRepository;
        this.abonnementRepository = abonnementRepository;
        this.clientRepository = clientRepository;
        this.villageRepository = villageRepository;
    }


    public Compteur createCompteur(AddCompteurDto addCompteurDto) {
        Compteur compteur = new Compteur();
        compteur.setType_compteur(addCompteurDto.getType_compteur());
        compteur.setMarque_compteur(addCompteurDto.getMarque_compteur());
        compteur.setDate_abonnement(addCompteurDto.getDate_abonnement());
        compteur.setStatut(addCompteurDto.isStatut());

        villageRepository.findById(addCompteurDto.getIdVillage());
        clientRepository.findById(addCompteurDto.getIdClient());
        abonnementRepository.findById(addCompteurDto.getIdAbonnement());
        forageRepository.findById(addCompteurDto.getIdForage());

        return compteurRepository.save(compteur);
    }

    public void deleteCompteur(int id){
        compteurRepository.deleteById(id);
    }

    public Optional<Compteur> findCompteurById(int id){
        return compteurRepository.findById(id);
    }

    public List<Compteur> getAllCompteur() {
        return compteurRepository.findAll();
    }

    public Compteur updateCompteur(Compteur compteur) {
            return compteurRepository.save(compteur);
    }
}
