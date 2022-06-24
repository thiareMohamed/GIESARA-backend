package sn.thiare.GIESARA.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.thiare.GIESARA.backend.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
}
