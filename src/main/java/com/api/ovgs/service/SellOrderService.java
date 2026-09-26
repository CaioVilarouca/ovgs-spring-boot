package com.api.ovgs.service;

import com.api.ovgs.dto.SellOrderResponseDTO;
import com.api.ovgs.dto.SellOrderResquetDTO;
import com.api.ovgs.entity.Scheduling;
import com.api.ovgs.entity.Client;
import com.api.ovgs.entity.SellOrder;
import com.api.ovgs.entity.TypeTransport;
import com.api.ovgs.repository.SellOrderRepository;
import org.springframework.stereotype.Service;

@Service
public class SellOrderService {

    private final SellOrderRepository sellOrderRepository;
    private final ClientService clientService;
    private final SchedulingService schedulingService;
    private final TypeTransportService typeTransportService;

    public SellOrderService(SellOrderRepository sellOrderRepository, ClientService clientService, SchedulingService schedulingService, TypeTransportService typeTransportService) {
        this.sellOrderRepository = sellOrderRepository;
        this.clientService = clientService;
        this.schedulingService = schedulingService;
        this.typeTransportService = typeTransportService;
    }

    public SellOrderResponseDTO createSellOrder(SellOrderResquetDTO sellOrderResquetDTO){
        // findById = buscar por id
        Client clientId = clientService.findById(sellOrderResquetDTO.getClienteId()).get();
        Scheduling schedulingId = schedulingService.findById(sellOrderResquetDTO.getSchedulingId()).get();
        TypeTransport typeTransportId = typeTransportService.findById(sellOrderResquetDTO.getTypeTransportId()).get();

        // Repository recebe a entidade
        SellOrder resquet = sellOrderResquetDTO.toEntity(clientId, schedulingId, typeTransportId);
        // Repository recebe a entidade
        SellOrder sellOrder = sellOrderRepository.save(resquet);
        // Conversão Entidade para DTO
        return new SellOrderResponseDTO(sellOrder);
    }
}
