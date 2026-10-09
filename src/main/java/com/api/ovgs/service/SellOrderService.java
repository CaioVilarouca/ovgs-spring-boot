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

    public SellOrderService(SellOrderRepository sellOrderRepository) {
        this.sellOrderRepository = sellOrderRepository;
    }

    @Transactional
    public SellOrderResponseDTO createSellOrder(SellOrderResquetDTO sellOrderResquetDTO){
        // findById = buscar por id
        //Client clientId = clientRepository.findById(sellOrderResquetDTO.getClienteId()).get();
        //Scheduling schedulingId = schedulingService.findById(sellOrderResquetDTO.getSchedulingId()).get();
       // TypeTransport typeTransportId = typeTransportService.findById(sellOrderResquetDTO.getTypeTransportId()).get();

        // Repository recebe a entidade
        SellOrder resquet = sellOrderResquetDTO.toEntity();
        // Repository recebe a entidade
        SellOrder sellOrder = sellOrderRepository.save(resquet);
        // Conversão Entidade para DTO
        return new SellOrderResponseDTO(sellOrder);
    }
}
