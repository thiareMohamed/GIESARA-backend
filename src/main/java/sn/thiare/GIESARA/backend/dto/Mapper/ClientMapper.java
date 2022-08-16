//package sn.thiare.GIESARA.backend.dto.Mapper;
//
//import sn.thiare.GIESARA.backend.dto.ClientDto;
//import sn.thiare.GIESARA.backend.model.Client;
//
//import java.util.List;
//
//public class ClientMapper {
//
//    public static List<ClientDto> fromEntityList(List<Client> clients) {
//        ClientDto clientDto = clients.stream()
//                .map(ClientDto::fromEntity)
//                .findFirst()
//                .orElse(null);
//        return (List<ClientDto>) clientDto;
//    }
//
//    public static List<Client> toEntityList(List<ClientDto> clientsDto) {
//        Client client = clientsDto.stream()
//                .map(ClientDto::toEntity)
//                .findFirst()
//                .orElse(null);
//        return (List<Client>) client;
//    }
//}
