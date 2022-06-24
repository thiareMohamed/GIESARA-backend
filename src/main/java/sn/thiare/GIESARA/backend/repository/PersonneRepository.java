package sn.thiare.GIESARA.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.thiare.GIESARA.backend.model.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Integer> {
}
