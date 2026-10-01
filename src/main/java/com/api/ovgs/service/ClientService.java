package com.api.ovgs.service;

import com.api.ovgs.dto.ClientRequestDTO;
import com.api.ovgs.dto.ClientResponseDTO;
import com.api.ovgs.entity.Client;
import com.api.ovgs.exception.FindByIdException;
import com.api.ovgs.repository.ClientRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

   public ClientResponseDTO clientCreate(@NonNull ClientRequestDTO clientRequestDTO) {

        Client clientRequest = clientRequestDTO.toEntity(); // Conversão DTO para entidade
        Client clientSave = clientRepository.save(clientRequest); // Repository recebe a entidade
        return new ClientResponseDTO(clientSave); // Conversão Entidade para DTO
   }

   // Buscar por ID. Obs: Pode ou não retorna algo
   public ClientResponseDTO findById(Integer id) {

       Optional<Client> client = clientRepository.findById(id);
       if (client.isPresent()) {
           return new ClientResponseDTO(client.get());
       } else {
           throw new FindByIdException("Cliente não encontrado. ID = "+ id);
       }
   }

   // Retorna todos os registros pelo IDs
   public List<ClientResponseDTO> findAll() {
        return clientRepository.findAll()
                .stream()
                .map(ClientResponseDTO::new)
                .toList();
   }
}