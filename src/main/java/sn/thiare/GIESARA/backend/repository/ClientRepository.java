package sn.thiare.GIESARA.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.thiare.GIESARA.backend.model.Client;

public interface ClientRepository   extends JpaRepository<Client, Integer> {
}
