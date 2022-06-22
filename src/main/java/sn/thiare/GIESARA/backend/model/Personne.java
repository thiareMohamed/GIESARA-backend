package sn.thiare.GIESARA.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;
    private String prenom;
    private Date date_naissance;
    private String lieu_naissance;
    private char sexe;
    private int numero_telephone;
    private int numero_cni;

}
