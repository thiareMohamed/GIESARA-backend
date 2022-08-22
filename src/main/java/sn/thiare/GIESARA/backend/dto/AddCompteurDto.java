package sn.thiare.GIESARA.backend.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class AddCompteurDto {
    private int id;

    private String type_compteur;
    private String type_abonnement;
    private Date date_abonnement;
    private String marque_compteur;
    private boolean statut;

    private int idForage;
    private int idVillage;
    private int idClient;
    private int idAbonnement;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType_compteur() {
        return type_compteur;
    }

    public void setType_compteur(String type_compteur) {
        this.type_compteur = type_compteur;
    }

    public String getType_abonnement() {
        return type_abonnement;
    }

    public void setType_abonnement(String type_abonnement) {
        this.type_abonnement = type_abonnement;
    }

    public Date getDate_abonnement() {
        return date_abonnement;
    }

    public void setDate_abonnement(Date date_abonnement) {
        this.date_abonnement = date_abonnement;
    }

    public String getMarque_compteur() {
        return marque_compteur;
    }

    public void setMarque_compteur(String marque_compteur) {
        this.marque_compteur = marque_compteur;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public int getIdForage() {
        return idForage;
    }

    public void setIdForage(int idForage) {
        this.idForage = idForage;
    }

    public int getIdVillage() {
        return idVillage;
    }

    public void setIdVillage(int idVillage) {
        this.idVillage = idVillage;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdAbonnement() {
        return idAbonnement;
    }

    public void setIdAbonnement(int idAbonnement) {
        this.idAbonnement = idAbonnement;
    }
}
