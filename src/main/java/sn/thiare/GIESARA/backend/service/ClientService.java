package sn.thiare.GIESARA.backend.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import sn.thiare.GIESARA.backend.model.Client;
import sn.thiare.GIESARA.backend.repository.ClientRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@CrossOrigin("*")
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

   public Client createClient(Client client){
        return clientRepository.save(client);
   }

   public void deleteClient(int id){
        clientRepository.deleteById(id);
   }
   public List<Client> getAllClient(){
        return clientRepository.findAll();
   }

   public Client getClient(int id){
        return clientRepository.findById(id).get();
   }

   public Client updateClient(Client client, int id){
        Client clientUpdate = clientRepository.findById(id).get();
        clientUpdate.setNom(client.getNom());
        clientUpdate.setPrenom(client.getPrenom());
        clientUpdate.setDate_naissance(client.getDate_naissance());
        clientUpdate.setLieu_naissance(client.getLieu_naissance());
        clientUpdate.setSexe(client.getSexe());
        clientUpdate.setNumero_telephone(client.getNumero_telephone());
        clientUpdate.setNumero_cni(client.getNumero_cni());
        clientUpdate.setCompteur(client.getCompteur());
        return clientRepository.save(clientUpdate);
   }

   public List<Client> showClientsByNom(String nom){
        return clientRepository.showClientsByNom(nom);
   }
}
