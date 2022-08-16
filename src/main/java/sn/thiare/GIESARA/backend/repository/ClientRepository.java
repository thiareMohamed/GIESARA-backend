package sn.thiare.GIESARA.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import sn.thiare.GIESARA.backend.model.Client;

import java.util.List;

@Repository
@CrossOrigin("*")
public interface ClientRepository   extends JpaRepository<Client, Integer> {
    @Query(value = "SELECT * FROM Personne WHERE TYPE = 'CLIENT' AND NOM LIKE %:nom%", nativeQuery = true)
    List<Client> showClientsByNom(@Param("nom") String nom);
}

