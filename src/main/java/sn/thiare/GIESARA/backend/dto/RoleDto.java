package sn.thiare.GIESARA.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.thiare.GIESARA.backend.model.Role;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDto {

    private int id;

    private String libelle;

    public Role toEntity(RoleDto roleDto) {

        if(roleDto == null) {
            return null;
        }
        Role role = new Role();
        role.setId(roleDto.getId());
        role.setLibelle(roleDto.getLibelle());
        return role;
    }

    public RoleDto fromEntity(Role role) {

        if(role == null) {
            return null;
        }
        RoleDto roleDto = new RoleDto();
        roleDto.setId(role.getId());
        roleDto.setLibelle(role.getLibelle());
        return roleDto;
    }
}
