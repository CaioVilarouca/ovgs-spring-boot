package com.api.ovgs.controller;

import com.api.ovgs.dto.TipoTransporteRequestDTO;
import com.api.ovgs.dto.TipoTransporteResponseDTO;
import com.api.ovgs.service.TypeTransportService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/tipoTransporte")
public class TipoTransporteController {

    private final TypeTransportService typeTransportService;

    public TipoTransporteController(TypeTransportService typeTransportService) {
        this.typeTransportService = typeTransportService;
    }

    @PostMapping
    public TipoTransporteResponseDTO criar(@RequestBody TipoTransporteRequestDTO tipoTransporteRequestDTO) {
        return  typeTransportService.criarTipoTransporte(tipoTransporteRequestDTO);
    }
}
