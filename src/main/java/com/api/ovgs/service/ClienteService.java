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

   public ClienteResponseDTO criarCliente(@NonNull ClienteRequestDTO clienteRequestDTO) {
       /* Cliente clienteRequest = clienteRequestDTO.clienteEntidade();Conversão DTO para entidade
          Cliente clienteSave = clienteRepository.save(clienteRequest); Repository recebe a entidade
          ClienteResponseDTO clienteReponseDTO = new ClienteResponseDTO(clienteSave);Conversão Entidade para DTO */
       return new ClienteResponseDTO(clienteRepository.save(clienteRequestDTO.clienteEntidade()));
   }

   // Pode ou não retorna alguma coisa
   //public Optional<Cliente> findById(Integer id) {
     //   return clienteRepository.buscarPorID(id);
   //}
}
