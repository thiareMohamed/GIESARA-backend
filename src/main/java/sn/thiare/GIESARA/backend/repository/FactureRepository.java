package sn.thiare.GIESARA.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.thiare.GIESARA.backend.model.Facture;

public interface FactureRepository   extends JpaRepository<Facture, Integer> {
}
