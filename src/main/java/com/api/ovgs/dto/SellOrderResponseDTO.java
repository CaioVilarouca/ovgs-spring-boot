package com.api.ovgs.dto;

import com.api.ovgs.domain.StatusSellOrder;
import com.api.ovgs.entity.*;

import java.time.LocalDateTime;
import java.util.List;

public class SellOrderResponseDTO {

    private Integer id;
    private LocalDateTime dayCreate;
    private LocalDateTime dayUpdate;
    private StatusSellOrder statusSellOrder;
    private Integer clienteId;
    private List<Item> item;
    private Scheduling scheduling;
    private TypeTransport typeTransport;

    public SellOrderResponseDTO(SellOrder sellOrder) {
        this.id = sellOrder.getId();
        this.dayCreate = sellOrder.getDayCreate();
        this.dayUpdate = sellOrder.getDayUpdate();
        this.statusSellOrder = sellOrder.getStatusSellOrder();
        this.clienteId = sellOrder.getCliente().getId();
        this.item = sellOrder.getItem();
        this.scheduling = sellOrder.getScheduling();
        this.typeTransport = sellOrder.getTypeTransport();
    }

    public Integer getId() {
        return id;
    }

    public LocalDateTime getDayCreate() {
        return dayCreate;
    }

    public LocalDateTime getDayUpdate() {
        return dayUpdate;
    }

    public StatusSellOrder getStatusSellOrder() {
        return statusSellOrder;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public List<Item> getItem() {
        return item;
    }

    public Scheduling getScheduling() {
        return scheduling;
    }

    public TypeTransport getTypeTransport() {
        return typeTransport;
    }
}
