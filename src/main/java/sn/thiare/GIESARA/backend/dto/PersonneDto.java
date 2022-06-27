package sn.thiare.GIESARA.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.thiare.GIESARA.backend.model.Personne;

import javax.persistence.*;
import java.util.Date;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE", length = 6, discriminatorType = DiscriminatorType.STRING)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonneDto {
    private int id;

    private String nom;
    private String prenom;
    private Date date_naissance;
    private String lieu_naissance;
    private char sexe;
    private int numero_telephone;
    private int numero_cni;

    public Personne toEntity(PersonneDto personneDto) {
        if (personneDto == null) {
            return null;
        }
        Personne personne = new Personne();
        personne.setId(personneDto.getId());
        personne.setNom(personneDto.getNom());
        personne.setPrenom(personneDto.getPrenom());
        personne.setDate_naissance(personneDto.getDate_naissance());
        personne.setLieu_naissance(personneDto.getLieu_naissance());
        personne.setSexe(personneDto.getSexe());
        personne.setNumero_telephone(personneDto.getNumero_telephone());
        personne.setNumero_cni(personneDto.getNumero_cni());
        return personne;
    }

    public PersonneDto fromEntity(Personne personne) {
        if (personne == null) {
            return null;
        }
        PersonneDto personneDto = new PersonneDto();
        personneDto.setId(personne.getId());
        personneDto.setNom(personne.getNom());
        personneDto.setPrenom(personne.getPrenom());
        personneDto.setDate_naissance(personne.getDate_naissance());
        personneDto.setLieu_naissance(personne.getLieu_naissance());
        personneDto.setSexe(personne.getSexe());
        personneDto.setNumero_telephone(personne.getNumero_telephone());
        personneDto.setNumero_cni(personne.getNumero_cni());
        return personneDto;
    }
}
