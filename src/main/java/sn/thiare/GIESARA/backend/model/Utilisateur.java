package sn.thiare.GIESARA.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("USER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur extends Personne{
    private String email;
    private String password;

    @ManyToMany
    private List<Role> role;

    @OneToOne(mappedBy = "utilisateur")
    private Reglement reglement;
}
