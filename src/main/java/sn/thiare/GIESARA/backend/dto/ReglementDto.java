package sn.thiare.GIESARA.backend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.thiare.GIESARA.backend.model.Reglement;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReglementDto {

    private int id;

    private Double somme_versee;

    @JsonIgnore
    private FactureDto factureDto;
    @JsonIgnore
    private UtilisateurDto utilisateurDto;

    public Reglement toEntity(ReglementDto reglementDto) {

        if(reglementDto == null) {
            return null;
        }
        Reglement reglement = new Reglement();
        reglement.setId(reglementDto.getId());
        reglement.setSomme_versee(reglementDto.getSomme_versee());
        return reglement;
    }

    public ReglementDto fromEntity(Reglement reglement) {

        if(reglement == null) {
            return null;
        }
        ReglementDto reglementDto = new ReglementDto();
        reglementDto.setId(reglement.getId());
        reglementDto.setSomme_versee(reglement.getSomme_versee());
        return reglementDto;
    }
}
