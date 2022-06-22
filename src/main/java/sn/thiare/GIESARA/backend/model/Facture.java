package sn.thiare.GIESARA.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String code_facture;
    private Date date_dernier_releve;
    private int ancien_index;
    private int nouvel_index;
    private int consomation_chiffre;
    private String consomation_lettre;
    private Date date_limite_paiement;
    private int prix_unitaire;
    private boolean statut;

    @ManyToOne
    private Compteur compteur;

}
