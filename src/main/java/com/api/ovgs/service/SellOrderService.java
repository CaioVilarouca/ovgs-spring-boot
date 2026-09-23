package com.api.ovgs.service;

import com.api.ovgs.dto.SellOrderResponseDTO;
import com.api.ovgs.dto.SellOrderResquetDTO;
import com.api.ovgs.entity.Scheduling;
import com.api.ovgs.entity.Client;
import com.api.ovgs.entity.SellOrder;
import com.api.ovgs.repository.SellOrderRepository;
import org.springframework.stereotype.Service;

@Service
public class SellOrderService {

    private final SellOrderRepository sellOrderRepository;
    private final ClientService clientService;
    private final SchedulingService schedulingService;

    public SellOrderService(SellOrderRepository sellOrderRepository, ClientService clientService, TypeTransportService typeTransportService, SchedulingService schedulingService) {
        this.sellOrderRepository = sellOrderRepository;
        this.clientService = clientService;
        this.schedulingService = schedulingService;
    }

    public SellOrderResponseDTO createSellOrder(SellOrderResquetDTO sellOrderResquetDTO){
        // findById = buscar por id
        Client clientId = clientService.findById(sellOrderResquetDTO.getClienteId()).get();
        Scheduling schedulingId = schedulingService.findById(sellOrderResquetDTO.getSchedulingId()).get();
        // Repository recebe a entidade
        SellOrder resquet = sellOrderResquetDTO.toEntity(clientId, schedulingId);
        // Repository recebe a entidade
        SellOrder sellOrder = sellOrderRepository.save(resquet);
        // Conversão Entidade para DTO
        return new SellOrderResponseDTO(sellOrder);
    }
}
