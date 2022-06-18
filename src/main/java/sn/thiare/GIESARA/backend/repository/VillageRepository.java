package sn.thiare.GIESARA.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.thiare.GIESARA.backend.model.Village;
@Repository
public interface VillageRepository extends JpaRepository<Village, Integer> {
}
