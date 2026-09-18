package com.api.ovgs.service;

import com.api.ovgs.dto.SellOrderResponseDTO;
import com.api.ovgs.dto.SellOrderResquetDTO;
import com.api.ovgs.entity.Cliente;
import com.api.ovgs.repository.SellOrderRepository;
import org.springframework.stereotype.Service;

@Service
public class SellOrderService {

    private final SellOrderRepository sellOrderRepository;
    private final ClienteService clienteService;

    public SellOrderService(SellOrderRepository sellOrderRepository, ClienteService clienteService) {
        this.sellOrderRepository = sellOrderRepository;
        this.clienteService = clienteService;
    }

    public SellOrderResponseDTO create(SellOrderResquetDTO sellOrderResquetDTO){

        Cliente cliente = clienteService.findById(sellOrderResquetDTO.getClienteId()).get();

        return new SellOrderResponseDTO(sellOrderRepository.save(sellOrderResquetDTO.toSellOrder(cliente)));
    }
}
