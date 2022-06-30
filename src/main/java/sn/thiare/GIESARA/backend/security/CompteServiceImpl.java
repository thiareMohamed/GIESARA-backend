package sn.thiare.GIESARA.backend.security;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.thiare.GIESARA.backend.model.Role;
import sn.thiare.GIESARA.backend.model.Utilisateur;
import sn.thiare.GIESARA.backend.repository.RoleRepository;
import sn.thiare.GIESARA.backend.repository.UtilisateurRepository;

import java.util.List;

@Service
@Transactional
public class CompteServiceImpl implements CompteService {

    private PasswordEncoder passwordEncoder;
    private UtilisateurRepository utilisateurRepository;
    private RoleRepository roleRepository;

    public CompteServiceImpl(PasswordEncoder passwordEncoder, UtilisateurRepository utilisateurRepository, RoleRepository roleRepository) {
        this.passwordEncoder = passwordEncoder;
        this.utilisateurRepository = utilisateurRepository;
        this.roleRepository = roleRepository;
    }
    @Override
    public Utilisateur createUtilisateur(Utilisateur utilisateur) {
        String password = utilisateur.getPassword();
        utilisateur.setPassword(passwordEncoder.encode(password));
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToEmail(String email, String libelle) {
        Utilisateur utilisateur = utilisateurRepository.findByEmail(email);
        Role role = roleRepository.findByLibelle(libelle);
        utilisateur.getRole().add(role);
    }

    @Override
    public Utilisateur chargerUtilisateurByEmail(String email) {
        return utilisateurRepository.findByEmail(email);
    }

    @Override
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    @Override
    public void detaleRole(String email, String libelle) {
        Utilisateur utilisateur = utilisateurRepository.findByEmail(email);
        Role role = roleRepository.findByLibelle(libelle);
        utilisateur.getRole().remove(role);
    }
    @Override
    public void deleteUtilisateur(String email) {
        Utilisateur utilisateur = utilisateurRepository.findByEmail(email);
        utilisateurRepository.delete(utilisateur);
    }
    @Override
    public void updateUtilisateur(Utilisateur utilisateur) {
        utilisateurRepository.save(utilisateur);
    }
}
