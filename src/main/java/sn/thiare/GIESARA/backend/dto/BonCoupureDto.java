package sn.thiare.GIESARA.backend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.thiare.GIESARA.backend.model.BonCoupure;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BonCoupureDto {

    private int id;
    private String raison_coupure;
    private int taxe;

    @JsonIgnore
    private FactureDto factureDto;

    public BonCoupure toEntity(BonCoupureDto bonCoupureDto) {

        if(bonCoupureDto == null) {
            return null;
        }
        BonCoupure bonCoupure = new BonCoupure();
        bonCoupure.setId(bonCoupureDto.getId());
        bonCoupure.setRaison_coupure(bonCoupureDto.getRaison_coupure());
        bonCoupure.setTaxe(bonCoupureDto.getTaxe());
        return bonCoupure;
    }

    public BonCoupureDto fromEntity(BonCoupure bonCoupure) {

        if(bonCoupure == null) {
            return null;
        }
        BonCoupureDto bonCoupureDto = new BonCoupureDto();
        bonCoupureDto.setId(bonCoupure.getId());
        bonCoupureDto.setRaison_coupure(bonCoupure.getRaison_coupure());
        bonCoupureDto.setTaxe(bonCoupure.getTaxe());
        return bonCoupureDto;
    }
}
