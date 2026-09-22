package com.api.ovgs.service;

import com.api.ovgs.dto.OrdemVendaResponseDTO;
import com.api.ovgs.dto.OrdemVendaResquetDTO;
import com.api.ovgs.entity.Cliente;
import com.api.ovgs.entity.OrdemVenda;
import com.api.ovgs.repository.OrdemVendaRepository;
import org.springframework.stereotype.Service;

@Service
public class OrdemVendaService {

    private final OrdemVendaRepository ordemVendaRepository;
    private final ClienteService clienteService;

    public OrdemVendaService(OrdemVendaRepository ordemVendaRepository, ClienteService clienteService) {
        this.ordemVendaRepository = ordemVendaRepository;
        this.clienteService = clienteService;
    }

    public OrdemVendaResponseDTO criarOrdemVenda(OrdemVendaResquetDTO ordemVendaResquetDTO){
        // findById = buscar o ID do cliente
        Cliente clienteId = clienteService.buscaPorID(ordemVendaResquetDTO.getClienteId()).get();
        // Repository recebe a entidade
        OrdemVenda resquet = ordemVendaResquetDTO.ordemVendaIntidade(clienteId);
        // Repository recebe a entidade
        OrdemVenda ordemVenda = ordemVendaRepository.save(resquet);
        // Conversão Entidade para DTO
        return new OrdemVendaResponseDTO(ordemVenda);
        //return new OrdemVendaResponseDTO(sellOrderRepository.save(ordemVendaResquetDTO.toSellOrder(clienteId)));
    }
}
