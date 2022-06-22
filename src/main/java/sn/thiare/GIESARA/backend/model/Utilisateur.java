package sn.thiare.GIESARA.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("USER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur extends Personne{
    private String email;
    private String password;
    @Enumerated(EnumType.ORDINAL)
    private Role role;
}
