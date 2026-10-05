package com.api.ovgs.controller;

import com.api.ovgs.dto.ClientRequestDTO;
import com.api.ovgs.dto.ClientResponseDTO;
import com.api.ovgs.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/client")
public class ClientController { // Cliente

    private final ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    // Criar Cliente
    @PostMapping
    public ClientResponseDTO create(@RequestBody ClientRequestDTO clientRequestDTO) {
        return clientService.clientCreate(clientRequestDTO);
    }

    // Retorna todos os IDs
    @GetMapping
    public List<ClientResponseDTO> findAll() {
        return clientService.findAll();
    }

    // Buscar por ID específico
    @GetMapping("/{id}")
    public ClientResponseDTO findById(@PathVariable Integer id) {
      return clientService.findById(id);
    }

}
