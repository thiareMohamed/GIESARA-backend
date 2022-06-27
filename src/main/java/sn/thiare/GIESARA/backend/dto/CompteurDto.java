package sn.thiare.GIESARA.backend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.thiare.GIESARA.backend.model.Compteur;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompteurDto {

    private int id;

    private String type_compteur;
    private String type_abonnement;
    private Date date_abonnement;
    private String marque_compteur;
    private boolean statut;

    @JsonIgnore
    private ForageDto forageDto;
    @JsonIgnore
    private VillageDto villageDto;
    @JsonIgnore
    private ClientDto clientDto;
    @JsonIgnore
    private List<FactureDto> factureDto;
    @JsonIgnore
    private AbonnementDto abonnementDto;

    public Compteur toEntity(CompteurDto compteurDto) {

        if(compteurDto == null) {
            return null;
        }
        Compteur compteur = new Compteur();
        compteur.setId(compteurDto.getId());
        compteur.setType_compteur(compteurDto.getType_compteur());
        compteur.setType_abonnement(compteurDto.getType_abonnement());
        compteur.setDate_abonnement(compteurDto.getDate_abonnement());
        compteur.setMarque_compteur(compteurDto.getMarque_compteur());
        compteur.setStatut(compteurDto.isStatut());
        return compteur;
    }

    public CompteurDto fromEntity(Compteur compteur) {

        if(compteur == null) {
            return null;
        }
        CompteurDto compteurDto = new CompteurDto();
        compteurDto.setId(compteur.getId());
        compteurDto.setType_compteur(compteur.getType_compteur());
        compteurDto.setType_abonnement(compteur.getType_abonnement());
        compteurDto.setDate_abonnement(compteur.getDate_abonnement());
        compteurDto.setMarque_compteur(compteur.getMarque_compteur());
        compteurDto.setStatut(compteur.isStatut());
        return compteurDto;
    }
}
