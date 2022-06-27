package sn.thiare.GIESARA.backend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.thiare.GIESARA.backend.model.Village;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VillageDto {

    private int id;

    private String nom;

    @JsonIgnore
    private CommuneDto communeDto;
    @JsonIgnore
    private List<CompteurDto> compteurDto;

    public Village toEntity(VillageDto villageDto) {
        if(villageDto == null) {
            return null;
        }
        Village village = new Village();
        village.setId(villageDto.getId());
        village.setNom(villageDto.getNom());
        return village;
    }

    public VillageDto fromEntity(Village village) {
        if(village == null) {
            return null;
        }
        VillageDto villageDto = new VillageDto();
        villageDto.setId(village.getId());
        villageDto.setNom(village.getNom());
        return villageDto;
    }
}
