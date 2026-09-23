package com.api.ovgs.controller;

import com.api.ovgs.dto.TypeTransportRequestDTO;
import com.api.ovgs.dto.TypeTransportResponseDTO;
import com.api.ovgs.service.TypeTransportService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/typeTransport")
public class TypeTransportController {

    private final TypeTransportService typeTransportService;

    public TypeTransportController(TypeTransportService typeTransportService) {
        this.typeTransportService = typeTransportService;
    }

    @PostMapping
    public TypeTransportResponseDTO create(@RequestBody TypeTransportRequestDTO typeTransportRequestDTO) {
        return  typeTransportService.createTypeTransport(typeTransportRequestDTO);
    }
}
