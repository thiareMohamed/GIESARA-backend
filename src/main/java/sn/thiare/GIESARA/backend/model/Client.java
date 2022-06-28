package sn.thiare.GIESARA.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@DiscriminatorValue("CLIENT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client extends Personne{

    @OneToMany(mappedBy = "client")
    private List<Compteur> compteur;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Client client = (Client) o;
        return compteur.equals(client.compteur);
    }

    public Client(int id, String nom, String prenom, Date date_naissance, String lieu_naissance, char sexe, int numero_telephone, String numero_cni, List<Compteur> compteur) {
        super(id, nom, prenom, date_naissance, lieu_naissance, sexe, numero_telephone, numero_cni);
        this.compteur = compteur;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), compteur);


    }
}
