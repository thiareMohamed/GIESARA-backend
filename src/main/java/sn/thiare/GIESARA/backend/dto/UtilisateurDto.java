package sn.thiare.GIESARA.backend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.thiare.GIESARA.backend.model.Utilisateur;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.List;

@DiscriminatorValue("USER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UtilisateurDto extends PersonneDto {
    private String email;
    private String password;

    @JsonIgnore
    private List<RoleDto> roleDto;
    @JsonIgnore
    private ReglementDto reglementDto;

    public Utilisateur toEntity(UtilisateurDto utilisateurDto) {
        if(utilisateurDto == null) {
            return null;
        }
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(utilisateurDto.getId());
        utilisateur.setNom(utilisateurDto.getNom());
        utilisateur.setPrenom(utilisateurDto.getPrenom());
        utilisateur.setEmail(utilisateurDto.getEmail());
        utilisateur.setPassword(utilisateurDto.getPassword());
        return utilisateur;
    }

    public UtilisateurDto fromEntity(Utilisateur utilisateur) {
        if(utilisateur == null) {
            return null;
        }
        UtilisateurDto utilisateurDto = new UtilisateurDto();
        utilisateurDto.setId(utilisateur.getId());
        utilisateurDto.setNom(utilisateur.getNom());
        utilisateurDto.setPrenom(utilisateur.getPrenom());
        utilisateurDto.setEmail(utilisateur.getEmail());
        utilisateurDto.setPassword(utilisateur.getPassword());
        return utilisateurDto;
    }
}
