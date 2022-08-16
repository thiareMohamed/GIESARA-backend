package sn.thiare.GIESARA.backend.web.rest;

import org.springframework.web.bind.annotation.*;
import sn.thiare.GIESARA.backend.dto.ClientDto;
import sn.thiare.GIESARA.backend.model.Client;
import sn.thiare.GIESARA.backend.service.ClientService;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/clients")
    public Client createClient(@RequestBody Client client){
       return clientService.createClient(client);
    }

    @GetMapping("/clients")
    public List<Client> showAllClient(){
        return clientService.getAllClient();
    }

    @GetMapping("/clients/{id}")
    public Client showClientByIdn(@PathVariable int id){
        return clientService.getClient(id);
    }

    @DeleteMapping("/clients/{id}")
    public void delete(@PathVariable int id){
        clientService.deleteClient(id);
    }

    @PutMapping("/clients/{id}")
    public Client update(@RequestBody Client client, @PathVariable int id){
        return clientService.updateClient(client, id);
    }

    @GetMapping("/clients/search/{nom}")
    public List<Client> getClientsByNom(@PathVariable String nom){
            String nomUpperCase = nom.toUpperCase();
        return clientService.showClientsByNom(nomUpperCase);
    }
}
