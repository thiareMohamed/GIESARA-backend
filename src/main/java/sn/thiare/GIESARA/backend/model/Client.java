package sn.thiare.GIESARA.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@DiscriminatorValue("CLIENT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client extends Personne{

    @OneToMany(mappedBy = "client")
    private List<Compteur> compteur;
}
