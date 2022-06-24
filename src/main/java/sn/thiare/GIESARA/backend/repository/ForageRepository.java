package sn.thiare.GIESARA.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.thiare.GIESARA.backend.model.BonCoupure;
import sn.thiare.GIESARA.backend.model.Forage;

public interface ForageRepository extends JpaRepository<Forage, Integer> {
}
