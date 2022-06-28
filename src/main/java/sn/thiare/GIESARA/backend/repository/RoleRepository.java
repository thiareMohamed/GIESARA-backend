package sn.thiare.GIESARA.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.thiare.GIESARA.backend.model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByLibelle(String libelle);
}