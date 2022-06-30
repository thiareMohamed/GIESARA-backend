package sn.thiare.GIESARA.backend.security;

import org.springframework.web.bind.annotation.CrossOrigin;
import sn.thiare.GIESARA.backend.model.Role;
import sn.thiare.GIESARA.backend.model.Utilisateur;

import java.util.List;
@CrossOrigin("*")

public interface CompteService {

    public Utilisateur createUtilisateur(Utilisateur utilisateur);
    public Role createRole(Role role);
    public void addRoleToEmail(String email, String libelle);
    public Utilisateur chargerUtilisateurByEmail(String email);
    List<Utilisateur> getAllUtilisateurs();
    public void detaleRole(String email, String libelle);
    public void deleteUtilisateur(int id);
    public void updateUtilisateur(Utilisateur utilisateur);
}
