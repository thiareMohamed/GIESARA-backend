package sn.thiare.GIESARA.backend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.thiare.GIESARA.backend.model.Commune;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommuneDto {

    private int id;
    private String nom;

    @JsonIgnore
    private List<VillageDto> villageDto;

    public Commune toEntity(CommuneDto communeDto) {

        if(communeDto == null) {
            return null;
        }
        Commune commune = new Commune();
        commune.setId(communeDto.getId());
        commune.setNom(communeDto.getNom());
        return commune;
    }

    public CommuneDto fromEntity(Commune commune) {

        if(commune == null) {
            return null;
        }
        CommuneDto communeDto = new CommuneDto();
        communeDto.setId(commune.getId());
        communeDto.setNom(commune.getNom());
        return communeDto;
    }
}
