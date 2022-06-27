package sn.thiare.GIESARA.backend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.thiare.GIESARA.backend.model.Facture;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FactureDto {
    private String code_facture;

    private Date date_dernier_releve;
    private int ancien_index;
    private int nouvel_index;
    private int consomation_chiffre;
    private String consomation_lettre;
    private Date date_limite_paiement;
    private int prix_unitaire;
    private boolean statut;

    @JsonIgnore
    private CompteurDto compteurDto;
    @JsonIgnore
    private BonCoupureDto bonCoupureDto;
    @JsonIgnore
    private ReglementDto reglementDto;

    public Facture toEntity(FactureDto factureDto) {
        if(factureDto == null) {
            return null;
        }
        Facture facture = new Facture();
        facture.setCode_facture(factureDto.getCode_facture());
        facture.setDate_dernier_releve(factureDto.getDate_dernier_releve());
        facture.setAncien_index(factureDto.getAncien_index());
        facture.setNouvel_index(factureDto.getNouvel_index());
        facture.setConsomation_chiffre(factureDto.getConsomation_chiffre());
        facture.setConsomation_lettre(factureDto.getConsomation_lettre());
        facture.setDate_limite_paiement(factureDto.getDate_limite_paiement());
        facture.setPrix_unitaire(factureDto.getPrix_unitaire());
        facture.setStatut(factureDto.isStatut());
        return facture;
    }

    public FactureDto fromEntity(Facture facture) {
        if(facture == null) {
            return null;
        }
        FactureDto factureDto = new FactureDto();
        factureDto.setCode_facture(facture.getCode_facture());
        factureDto.setDate_dernier_releve(facture.getDate_dernier_releve());
        factureDto.setAncien_index(facture.getAncien_index());
        factureDto.setNouvel_index(facture.getNouvel_index());
        factureDto.setConsomation_chiffre(facture.getConsomation_chiffre());
        factureDto.setConsomation_lettre(facture.getConsomation_lettre());
        factureDto.setDate_limite_paiement(facture.getDate_limite_paiement());
        factureDto.setPrix_unitaire(facture.getPrix_unitaire());
        factureDto.setStatut(facture.isStatut());
        return factureDto;
    }
}
