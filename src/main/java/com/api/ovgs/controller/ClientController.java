package com.api.ovgs.controller;

import com.api.ovgs.dto.ClientRequestDTO;
import com.api.ovgs.dto.ClientResponseDTO;
import com.api.ovgs.service.ClientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/client")
public class ClientController { // Cliente

    private final ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @PostMapping
    public ClientResponseDTO create(@RequestBody ClientRequestDTO clientRequestDTO) {
      return clientService.clientCreate(clientRequestDTO);
    }
}
