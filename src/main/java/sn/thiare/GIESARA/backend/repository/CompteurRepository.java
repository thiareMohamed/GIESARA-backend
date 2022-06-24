package sn.thiare.GIESARA.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.thiare.GIESARA.backend.model.Compteur;

public interface CompteurRepository   extends JpaRepository<Compteur, Integer> {
}
