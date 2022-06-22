package sn.thiare.GIESARA.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Forage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom_site;
    private Double longitude;
    private Double latitude;
    private Date date_installation;
    private int profondeur_forage;
    private int hauteur;
    private int capacite;
    private int hauteur_sous_radier;
    private String type_paratonerre;
    private String type_reservoir;
    private int capacite_reservoir;

    @OneToMany(mappedBy = "forage")
    private List<Compteur> compteur;
}
