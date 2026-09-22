package com.api.ovgs.controller;

import com.api.ovgs.dto.OrdemVendaResponseDTO;
import com.api.ovgs.dto.OrdemVendaResquetDTO;
import com.api.ovgs.service.OrdemVendaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/ordemVenda")
public class OrdemVendaController {

    private final OrdemVendaService ordemVendaService;

    public OrdemVendaController(OrdemVendaService ordemVendaService) {
        this.ordemVendaService = ordemVendaService;
    }

    @PostMapping
    public OrdemVendaResponseDTO criar(@RequestBody OrdemVendaResquetDTO ordemVendaResquetDTO){
        return ordemVendaService.criarOrdemVenda(ordemVendaResquetDTO);
    }
}
