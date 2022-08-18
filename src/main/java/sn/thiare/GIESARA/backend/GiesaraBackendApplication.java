package sn.thiare.GIESARA.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import sn.thiare.GIESARA.backend.model.*;
import sn.thiare.GIESARA.backend.security.CompteService;
import sn.thiare.GIESARA.backend.service.ClientService;
import sn.thiare.GIESARA.backend.service.CommuneService;
import sn.thiare.GIESARA.backend.service.VillageService;

import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class GiesaraBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(GiesaraBackendApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	@Bean
	CommandLineRunner start(CompteService compteService,
							ClientService clientService,
							CommuneService communeService,
							VillageService villageService) {
		return args -> {
			compteService.createRole(new Role(1,"ADMIN"));
			compteService.createRole(new Role(2,"RELEVEUR"));
			compteService.createRole(new Role(3,"CAISSIER"));


//			compteService.createUtilisateur(new Utilisateur(null,"THIARE","Mohamed","1998-08-29","Dakar",'M',773813060,3454545454545,"thiaremohamed.mt@gmail.com","Qwerty123",new ArrayList<>(),null));
		compteService.createUtilisateur(new Utilisateur(1, "SOUHAI", "Mohamed", new Date(), "Dakar", 'M', 773813060, "12233445456546", "thiaremohamed.mt@gmail.com", "Qwerty123", new ArrayList<>(), null),"RELEVEUR");
		compteService.createUtilisateur(new Utilisateur(2, "SOUHAI", "Mohamed", new Date(), "Dakar", 'M', 773813062, "12233445456549", "thiare@gamil.com", "Awerty123", new ArrayList<>(), null),"CAISSIER");
		compteService.createUtilisateur(new Utilisateur(3, "SOUHAI", "Mohamed", new Date(), "Dakar", 'M', 773813063, "12233445456540", "thia@gmail.com", "Qwerty321", new ArrayList<>(), null),"ADMIN");

			clientService.createClient(new Client(4,"THIARE", "Samba", new Date(), "Linguere", 'M', 773813069, "12233445456541", new ArrayList<>()));
			clientService.createClient(new Client(5,"THIARE", "Mohamed", new Date(), "Linguere", 'M', 773813064, "12233445456545", new ArrayList<>()));
			clientService.createClient(new Client(6,"THIARE", "Astu", new Date(), "Linguere", 'F', 773813065, "12233445456544", new ArrayList<>()));
			clientService.createClient(new Client(7,"THIARE", "Lamine", new Date(), "Linguere", 'M', 773813066, "12233445456543", new ArrayList<>()));

			Commune commune = communeService.createCommune(new Commune(1, "Keur Samba Gueye", null));
			villageService.createVillage(new Village(1,"Keur aibe ka",commune,new ArrayList<>()));
		};
	}
}
