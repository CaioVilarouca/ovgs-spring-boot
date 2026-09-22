package com.api.ovgs.service;

import com.api.ovgs.dto.OrdemVendaResponseDTO;
import com.api.ovgs.dto.OrdemVendaResquetDTO;
import com.api.ovgs.entity.Agendamento;
import com.api.ovgs.entity.Cliente;
import com.api.ovgs.entity.OrdemVenda;
import com.api.ovgs.repository.OrdemVendaRepository;
import org.springframework.stereotype.Service;

@Service
public class OrdemVendaService {

    private final OrdemVendaRepository ordemVendaRepository;
    private final ClienteService clienteService;
    private final AgendamentoService agendamentoService;

    public OrdemVendaService(OrdemVendaRepository ordemVendaRepository, ClienteService clienteService, TipoTransporteService tipoTransporteService, AgendamentoService agendamentoService) {
        this.ordemVendaRepository = ordemVendaRepository;
        this.clienteService = clienteService;
        this.agendamentoService = agendamentoService;
    }

    public OrdemVendaResponseDTO criarOrdemVenda(OrdemVendaResquetDTO ordemVendaResquetDTO){
        // findById = buscar o IDs
        Cliente clienteId = clienteService.findById(ordemVendaResquetDTO.getClienteId()).get();
        Agendamento agendamentoId = agendamentoService.findById(ordemVendaResquetDTO.getAgendamentoId()).get();

        // Repository recebe a entidade
        OrdemVenda resquet = ordemVendaResquetDTO.ordemVendaIntidade(clienteId, agendamentoId);
        // Repository recebe a entidade
        OrdemVenda ordemVenda = ordemVendaRepository.save(resquet);
        // Conversão Entidade para DTO
        return new OrdemVendaResponseDTO(ordemVenda);
        //return new OrdemVendaResponseDTO(sellOrderRepository.save(ordemVendaResquetDTO.toSellOrder(clienteId)));
    }
}
