package com.api.ovgs.controller;

import com.api.ovgs.dto.SellOrderResponseDTO;
import com.api.ovgs.dto.SellOrderResquetDTO;
import com.api.ovgs.service.OrdemVendaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/sellOrder")
public class OrdemVendaController {

    private final OrdemVendaService ordemVendaService;

    public OrdemVendaController(OrdemVendaService ordemVendaService) {
        this.ordemVendaService = ordemVendaService;
    }

    @PostMapping
    public SellOrderResponseDTO createSellOrder(@RequestBody SellOrderResquetDTO sellOrderRequestDTO){
        return ordemVendaService.createNewSellOrder(sellOrderRequestDTO);
    }
}
