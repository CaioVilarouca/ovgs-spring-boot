package com.api.ovgs.controller;

import com.api.ovgs.dto.ClienteRequestDTO;
import com.api.ovgs.dto.ClienteResponseDTO;
import com.api.ovgs.service.ClienteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @PostMapping
    public ClienteResponseDTO createCliente(@RequestBody ClienteRequestDTO clienteRequestDTO) {
      ClienteResponseDTO responseCliente = clienteService.createNewCliente(clienteRequestDTO) ;
      return responseCliente;
    }
}
