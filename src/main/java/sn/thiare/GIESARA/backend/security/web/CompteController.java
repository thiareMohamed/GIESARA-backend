package sn.thiare.GIESARA.backend.security.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.thiare.GIESARA.backend.model.Role;
import sn.thiare.GIESARA.backend.model.Utilisateur;
import sn.thiare.GIESARA.backend.security.CompteService;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CompteController {

    private CompteService compteService;
    public CompteController(CompteService compteService) {
        this.compteService = compteService;
    }

    @GetMapping("/utilisateurs")
    public List<Utilisateur> getAllUtilisateurs() {
        return compteService.getAllUtilisateurs();
    }

    @PostMapping("/utilisateurs/{LibelleRole}")
    public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur, @PathVariable String LibelleRole) {
        return compteService.createUtilisateur(utilisateur, LibelleRole);
    }

    @PostMapping("/roles")
    public Role createRole(@RequestBody Role role) {
        return compteService.createRole(role);
    }
    @PostMapping("/addRoleToEmail")
    public void addRoleToEmail(@RequestBody RoleEmailForm roleEmailForm, String LibelleRole) {
        compteService.addRoleToEmail(roleEmailForm.getEmail(), LibelleRole);
    }
    @DeleteMapping("/utilisateurs/{id}")
    public void deleteUtilisateur(@PathVariable int id) {
        compteService.deleteUtilisateur(id);
    }
    @PutMapping("/removeRole")
    public boolean detaleRole(@RequestBody RoleEmailForm roleEmailForm) {
        return compteService.detaleRole(roleEmailForm.getEmail(), roleEmailForm.getLibelle());
    }
    @GetMapping("/utilisateurs/{email}")
    public Utilisateur chargerUtilisateurByEmail(@PathVariable String email) {
        return compteService.chargerUtilisateurByEmail(email);
    }

    @PatchMapping("/utilisateurs/update/{id}")
    public Utilisateur updateUtilisateur(@RequestBody Utilisateur utilisateur, @PathVariable int id) {
        return compteService.updateUtilisateur(utilisateur, id);
    }

    @GetMapping("/utilisateur/{id}")
    public Utilisateur getUtilisateurById(@PathVariable int id) {
        return compteService.getUtilisateurById(id);
    }
}
@Data
@AllArgsConstructor
@NoArgsConstructor
class RoleEmailForm {
    String email;
    String libelle;
}