package com.api.ovgs.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.api.ovgs.dto.ClienteRequestDTO;
import com.api.ovgs.dto.ClienteResponseDTO;
import com.api.ovgs.entity.Cliente;
import com.api.ovgs.repository.ClienteRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

   public ClienteResponseDTO createNewCliente(@NonNull ClienteRequestDTO clienteRequestDTO) {

        Cliente clienteRequest = clienteRequestDTO.toEntity();// Conversão DTO para entidade
        Cliente clienteNewSave = clienteRepository.save(clienteRequest); // Repository recebe a entidade
        ClienteResponseDTO clienteReponseDTO = new ClienteResponseDTO(clienteNewSave); // Conversão Entidade para DTO
        return clienteReponseDTO;
   }

   // Pode ou não retorna alguma coisa
   public Optional<Cliente> findById(Integer id) {
        return clienteRepository.findById(id);
   }
}
