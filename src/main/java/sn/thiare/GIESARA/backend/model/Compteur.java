package sn.thiare.GIESARA.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compteur  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type_compteur;
    private String type_abonnement;
    private Date date_abonnement;
    private String marque_compteur;
    private boolean statut;

    @ManyToOne
    private Forage forage;

    @ManyToOne
    private Village village;

}
