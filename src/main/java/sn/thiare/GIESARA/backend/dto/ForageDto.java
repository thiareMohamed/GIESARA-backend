package sn.thiare.GIESARA.backend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.thiare.GIESARA.backend.model.Forage;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ForageDto {

    private int id;

    private String nom_site;
    private Double longitude;
    private Double latitude;
    private Date date_installation;
    private int profondeur_forage;
    private int hauteur;
    private int capacite;
    private int hauteur_sous_radier;
    private String type_paratonerre;
    private String type_reservoir;
    private int capacite_reservoir;

    @JsonIgnore
    private List<CompteurDto> compteurDto;

    public Forage toEntity(ForageDto forageDto) {

        if(forageDto == null) {
            return null;
        }
        Forage forage = new Forage();
        forage.setId(forageDto.getId());
        forage.setNom_site(forageDto.getNom_site());
        forage.setLongitude(forageDto.getLongitude());
        forage.setLatitude(forageDto.getLatitude());
        forage.setDate_installation(forageDto.getDate_installation());
        forage.setProfondeur_forage(forageDto.getProfondeur_forage());
        forage.setHauteur(forageDto.getHauteur());
        forage.setCapacite(forageDto.getCapacite());
        forage.setHauteur_sous_radier(forageDto.getHauteur_sous_radier());
        forage.setType_paratonerre(forageDto.getType_paratonerre());
        forage.setType_reservoir(forageDto.getType_reservoir());
        forage.setCapacite_reservoir(forageDto.getCapacite_reservoir());
        return forage;
    }

    public ForageDto fromEntity(Forage forage) {

        if(forage == null) {
            return null;
        }
        ForageDto forageDto = new ForageDto();
        forageDto.setId(forage.getId());
        forageDto.setNom_site(forage.getNom_site());
        forageDto.setLongitude(forage.getLongitude());
        forageDto.setLatitude(forage.getLatitude());
        forageDto.setDate_installation(forage.getDate_installation());
        forageDto.setProfondeur_forage(forage.getProfondeur_forage());
        forageDto.setHauteur(forage.getHauteur());
        forageDto.setCapacite(forage.getCapacite());
        forageDto.setHauteur_sous_radier(forage.getHauteur_sous_radier());
        forageDto.setType_paratonerre(forage.getType_paratonerre());
        forageDto.setType_reservoir(forage.getType_reservoir());
        forageDto.setCapacite_reservoir(forage.getCapacite_reservoir());
        return forageDto;
    }
}
