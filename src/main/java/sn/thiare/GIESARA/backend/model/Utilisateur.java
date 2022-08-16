package sn.thiare.GIESARA.backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@DiscriminatorValue("USER")
@Data
@NoArgsConstructor
public class Utilisateur extends Personne{
    @Column(unique = true)
    private String email;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> role = new ArrayList<>();

    @OneToOne(mappedBy = "utilisateur")
    private Reglement reglement;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Utilisateur that = (Utilisateur) o;
        return email.equals(that.email) && password.equals(that.password) && role.equals(that.role) && reglement.equals(that.reglement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, password, role, reglement);
    }


        public Utilisateur(int id, String nom, String prenom, Date date_naissance, String lieu_naissance, char sexe, int numero_telephone, String numero_cni, String email, String password, List<Role> role, Reglement reglement) {
        super(id, nom, prenom, date_naissance, lieu_naissance, sexe, numero_telephone, numero_cni);
        this.email = email;
        this.password = password;
        this.role = role;
        this.reglement = reglement;
    }
}
