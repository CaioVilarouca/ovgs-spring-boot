package com.api.ovgs.service;

import com.api.ovgs.dto.ClientRequestDTO;
import com.api.ovgs.dto.ClientResponseDTO;
import com.api.ovgs.entity.Client;
import com.api.ovgs.repository.ClientRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

   public ClientResponseDTO clientCreate(@NonNull ClientRequestDTO clientRequestDTO) {
        /* Client clienteRequest = clientRequestDTO.clienteEntidade(); = Conversão DTO para entidade
          Client clienteSave = clienteRepository.save(clienteRequest); = Repository recebe a entidade
          ClientResponseDTO clienteReponseDTO = new ClientResponseDTO(clienteSave); = Conversão Entidade para DTO */
       return new ClientResponseDTO(clientRepository.save(clientRequestDTO.toEntity()));
   }

   // Buscar por ID. Obs: Pode ou não retorna algo
   public ClientResponseDTO findById(Integer id) {
       Optional<Client> client = clientRepository.findById(id);
       if (client.isPresent()) {
           return new ClientResponseDTO(client.get());
       } else {
           throw new IllegalArgumentException("Cliente não encontrado.");
       }
   }

   // Retorna todos os registros pelo ID
   public List<ClientResponseDTO> findAll() {
        return clientRepository.findAll().stream().map(ClientResponseDTO::new).toList();
   }
}