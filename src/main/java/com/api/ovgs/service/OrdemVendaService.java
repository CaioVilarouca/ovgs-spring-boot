package com.api.ovgs.service;

import com.api.ovgs.dto.SellOrderResponseDTO;
import com.api.ovgs.dto.SellOrderResquetDTO;
import com.api.ovgs.entity.Cliente;
import com.api.ovgs.entity.OrdemVenda;
import com.api.ovgs.repository.OrdemVendaRepository;
import org.springframework.stereotype.Service;

@Service
public class OrdemVendaService {

    private final OrdemVendaRepository sellOrderRepository;
    private final ClienteService clienteService;

    public OrdemVendaService(OrdemVendaRepository ordemVendaRepository, ClienteService clienteService) {
        this.sellOrderRepository = ordemVendaRepository;
        this.clienteService = clienteService;
    }

    public SellOrderResponseDTO createNewSellOrder(SellOrderResquetDTO sellOrderResquetDTO){
        // findById = buscar o ID do cliente
        Cliente clienteId = clienteService.findById(sellOrderResquetDTO.getClienteId()).get();
        // Repository recebe a entidade
        OrdemVenda resquet = sellOrderResquetDTO.toSellOrder(clienteId);
        // Repository recebe a entidade
        OrdemVenda sellOrderNew = sellOrderRepository.save(resquet);
        // Conversão Entidade para DTO
        return new SellOrderResponseDTO(sellOrderNew);
        //Cliente clienteId = clienteService.findById(sellOrderResquetDTO.getClienteId()).get();
        //return new SellOrderResponseDTO(sellOrderRepository.save(sellOrderResquetDTO.toSellOrder(clienteId)));
    }
}
