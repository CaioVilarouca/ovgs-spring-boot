package com.api.ovgs.service;

import com.api.ovgs.dto.ClientRequestDTO;
import com.api.ovgs.dto.ClientResponseDTO;
import com.api.ovgs.entity.Client;
import com.api.ovgs.repository.ClientRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Service;

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
   public Optional<Client> findById(Integer id) {
     return clientRepository.findById(id);
   }
}
