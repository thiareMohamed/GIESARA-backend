package sn.thiare.GIESARA.backend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.thiare.GIESARA.backend.model.Abonnement;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AbonnementDto {

    private int id;
    private String libelle;
    private int prix_unitaire;

    @JsonIgnore
    private List<CompteurDto> compteurDto;

    public Abonnement toEntity(AbonnementDto abonnementDto) {

        if(abonnementDto == null) {
            return null;
        }
        Abonnement abonnement = new Abonnement();
        abonnement.setId(abonnementDto.getId());
        abonnement.setLibelle(abonnementDto.getLibelle());
        abonnement.setPrix_unitaire(abonnementDto.getPrix_unitaire());
        return abonnement;
    }

    public AbonnementDto fromEntity(Abonnement abonnement) {

        if(abonnement == null) {
            return null;
        }
        AbonnementDto abonnementDto = new AbonnementDto();
        abonnementDto.setId(abonnement.getId());
        abonnementDto.setLibelle(abonnement.getLibelle());
        abonnementDto.setPrix_unitaire(abonnement.getPrix_unitaire());
        return abonnementDto;
    }
}
