package sn.thiare.GIESARA.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.thiare.GIESARA.backend.model.BonCoupure;
import sn.thiare.GIESARA.backend.model.Forage;
@Repository
public interface ForageRepository extends JpaRepository<Forage, Integer> {
}
