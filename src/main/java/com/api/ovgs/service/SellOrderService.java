package com.api.ovgs.service;

import com.api.ovgs.dto.SellOrderResponseDTO;
import com.api.ovgs.dto.SellOrderResquetDTO;
import com.api.ovgs.entity.*;
import com.api.ovgs.exception.FindByIdException;
import com.api.ovgs.repository.ClientRepository;
import com.api.ovgs.repository.SellOrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellOrderService {

    private final SellOrderRepository sellOrderRepository;
    private final ClientRepository clientRepository;
    private final SchedulingService schedulingService;
    private final TypeTransportService typeTransportService;
    private final ItemService itemService;

    public SellOrderService(SellOrderRepository sellOrderRepository, ClientRepository clientRepository, SchedulingService schedulingService, TypeTransportService typeTransportService, ItemService itemService) {
        this.sellOrderRepository = sellOrderRepository;
        this.clientRepository = clientRepository;
        this.schedulingService = schedulingService;
        this.typeTransportService = typeTransportService;
        this.itemService = itemService;
    }

    @Transactional
    public SellOrderResponseDTO createSellOrder(SellOrderResquetDTO sellOrderResquetDTO){
        // findById = buscar por id
        Client clientId = clientRepository.findById(sellOrderResquetDTO.getClienteId()).get();
        Scheduling schedulingId = schedulingService.findById(sellOrderResquetDTO.getSchedulingId()).get();
       // TypeTransport typeTransportId = typeTransportService.findById(sellOrderResquetDTO.getTypeTransportId()).get();

        // Retorna os registro de Items
        /*
        List<Item> itemsId = sellOrderResquetDTO.getItem()
                .stream()
                .map(item -> itemService.findById(item.getId())
                        .orElseThrow(() ->
                                new FindByIdException("Item não encontrado.")))
                .toList();
        */
        List<Item> itemsId = null;
        TypeTransport typeTransportId = null;
        // Repository recebe a entidade
        SellOrder resquet = sellOrderResquetDTO.toEntity(clientId, schedulingId, typeTransportId, itemsId);
        // Repository recebe a entidade
        SellOrder sellOrder = sellOrderRepository.save(resquet);
        // Conversão Entidade para DTO
        return new SellOrderResponseDTO(sellOrder);
    }
}
