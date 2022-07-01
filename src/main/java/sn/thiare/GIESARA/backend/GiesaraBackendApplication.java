package sn.thiare.GIESARA.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import sn.thiare.GIESARA.backend.model.Role;
import sn.thiare.GIESARA.backend.model.Utilisateur;
import sn.thiare.GIESARA.backend.security.CompteService;

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
	CommandLineRunner start(CompteService compteService) {
		return args -> {
			compteService.createRole(new Role(1,"ADMIN"));
			compteService.createRole(new Role(2,"RELEVEUR"));
			compteService.createRole(new Role(3,"CAISSIER"));


//			compteService.createUtilisateur(new Utilisateur(null,"THIARE","Mohamed","1998-08-29","Dakar",'M',773813060,3454545454545,"thiaremohamed.mt@gmail.com","Qwerty123",new ArrayList<>(),null));
		compteService.createUtilisateur(new Utilisateur(1, "SOUHAI", "Mohamed", new Date(), "Dakar", 'M', 773813060, "12233445456546", "thiaremohamed.mt@gmail.com", "Qwerty123", new ArrayList<>(), null));
		compteService.createUtilisateur(new Utilisateur(2, "SOUHAI", "Mohamed", new Date(), "Dakar", 'M', 773813062, "12233445456549", "thiare@gamil.com", "Awerty123", new ArrayList<>(), null));
		compteService.createUtilisateur(new Utilisateur(3, "SOUHAI", "Mohamed", new Date(), "Dakar", 'M', 773813063, "12233445456540", "thia@gmail.com", "Qwerty321", new ArrayList<>(), null));

			compteService.addRoleToEmail("thiare@gamil.com","RELEVEUR");
			compteService.addRoleToEmail("thia@gmail.com","CAISSIER");
			compteService.addRoleToEmail("thiaremohamed.mt@gmail.com","ADMIN");
			compteService.addRoleToEmail("thiaremohamed.mt@gmail.com","RELEVEUR");
			compteService.addRoleToEmail("thiaremohamed.mt@gmail.com","CAISSIER");

			compteService.detaleRole("thiaremohamed.mt@gmail.com","ADMIN");
			compteService.detaleRole("thiaremohamed.mt@gmail.com","RELEVEUR");
//			compteService.deleteUtilisateur("thiaremohamed.mt@gmail.com");

		};
	}
}
