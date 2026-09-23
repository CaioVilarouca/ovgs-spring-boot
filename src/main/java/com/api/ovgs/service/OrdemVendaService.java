package com.api.ovgs.service;

import com.api.ovgs.dto.OrdemVendaResponseDTO;
import com.api.ovgs.dto.OrdemVendaResquetDTO;
import com.api.ovgs.entity.Agendamento;
import com.api.ovgs.entity.Client;
import com.api.ovgs.entity.OrdemVenda;
import com.api.ovgs.repository.OrdemVendaRepository;
import org.springframework.stereotype.Service;

@Service
public class OrdemVendaService {

    private final OrdemVendaRepository ordemVendaRepository;
    private final ClientService clientService;
    private final AgendamentoService agendamentoService;

    public OrdemVendaService(OrdemVendaRepository ordemVendaRepository, ClientService clientService, TipoTransporteService tipoTransporteService, AgendamentoService agendamentoService) {
        this.ordemVendaRepository = ordemVendaRepository;
        this.clientService = clientService;
        this.agendamentoService = agendamentoService;
    }

    public OrdemVendaResponseDTO criarOrdemVenda(OrdemVendaResquetDTO ordemVendaResquetDTO){
        // findById = buscar
        Client clientId = clientService.findById(ordemVendaResquetDTO.getClienteId()).get();
        Agendamento agendamentoId = agendamentoService.findById(ordemVendaResquetDTO.getAgendamentoId()).get();

        // Repository recebe a entidade
        OrdemVenda resquet = ordemVendaResquetDTO.ordemVendaIntidade(clientId, agendamentoId);
        // Repository recebe a entidade
        OrdemVenda ordemVenda = ordemVendaRepository.save(resquet);
        // Conversão Entidade para DTO
        return new OrdemVendaResponseDTO(ordemVenda);
        //return new OrdemVendaResponseDTO(sellOrderRepository.save(ordemVendaResquetDTO.toSellOrder(clientId)));
    }
}
