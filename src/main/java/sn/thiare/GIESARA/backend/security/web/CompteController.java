package sn.thiare.GIESARA.backend.security.web;

import lombok.Data;
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

    @PostMapping("/utilisateurs")
    public Utilisateur createUtilisateur(@RequestBody Utilisateur utilisateur) {
        return compteService.createUtilisateur(utilisateur);
    }

    @PostMapping("/roles")
    public Role createRole(@RequestBody Role role) {
        return compteService.createRole(role);
    }
    @PostMapping("addRoleToEmail")
    public void addRoleToEmail(@RequestBody RoleEmailForm roleEmailForm) {
        compteService.addRoleToEmail(roleEmailForm.getEmail(), roleEmailForm.getLibelle());
    }
    @DeleteMapping("/utilisateurs/{email}")
    public void deleteUtilisateur(@PathVariable String email) {
        compteService.deleteUtilisateur(email);
    }
    @PostMapping("/removeRole")
    public void detaleRole(@RequestBody RoleEmailForm roleEmailForm) {
        compteService.detaleRole(roleEmailForm.getEmail(), roleEmailForm.getLibelle());
    }

}
@Data
class RoleEmailForm {
    String email;
    String libelle;
}