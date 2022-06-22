package sn.thiare.GIESARA.backend.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Utilisateur extends Personne{
    private String email;
    private String password;
    @Enumerated(EnumType.ORDINAL)
    private Role role;
}
