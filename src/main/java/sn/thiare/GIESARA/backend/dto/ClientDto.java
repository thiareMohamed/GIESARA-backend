package sn.thiare.GIESARA.backend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sn.thiare.GIESARA.backend.model.Client;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
@DiscriminatorValue("CLIENT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto extends PersonneDto {

    @JsonIgnore
    private List<CompteurDto> compteurDto;

    public Client toEntity(ClientDto clientDto) {
        if(clientDto == null) {
            return null;
        }
        Client client = new Client();
        client.setId(clientDto.getId());
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        return client;
    }

    public ClientDto fromEntity(Client client) {
        if(client == null) {
            return null;
        }
        ClientDto clientDto = new ClientDto();
        clientDto.setId(client.getId());
        clientDto.setNom(client.getNom());
        clientDto.setPrenom(client.getPrenom());
        return clientDto;
    }
}
