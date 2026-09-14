package com.api.ovgs.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.api.ovgs.dto.ClienteRequestDTO;
import com.api.ovgs.dto.ClienteResponseDTO;
import com.api.ovgs.entity.Cliente;
import com.api.ovgs.repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

   public ClienteResponseDTO createNewCliente(ClienteRequestDTO clienteRequestDTO) {
        Cliente clienteNewSave = clienteRepository.save(clienteRequestDTO.toEntity());
        return new ClienteResponseDTO(clienteNewSave);
   }
}
