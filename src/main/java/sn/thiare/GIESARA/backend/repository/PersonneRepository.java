package sn.thiare.GIESARA.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import sn.thiare.GIESARA.backend.model.Personne;
@Repository
@CrossOrigin("*")
public interface PersonneRepository extends JpaRepository<Personne, Integer> {
}
