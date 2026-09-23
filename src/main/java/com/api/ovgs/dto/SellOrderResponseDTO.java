package com.api.ovgs.dto;

import com.api.ovgs.domain.SellOrderStatus;
import com.api.ovgs.entity.*;

import java.time.LocalDateTime;
import java.util.List;

public class SellOrderResponseDTO {

    private Integer id;

    private LocalDateTime dayCreate;

    private LocalDateTime dayUpdate;

    private SellOrderStatus sellOrderStatus;

    private Integer clienteId;

    private List<Item> item;
    private Integer schedulingId;

    private TypeTransport typeTransport;

    public SellOrderResponseDTO(SellOrder sellOrder) {
        this.id = sellOrder.getId();
        this.dayCreate = sellOrder.getDayCreate();
        this.dayUpdate = sellOrder.getDayUpdate();
        this.sellOrderStatus = sellOrder.getSellOrderStatus();
        this.clienteId = sellOrder.getClient().getId();
        this.item = sellOrder.getItem();
        this.schedulingId = sellOrder.getScheduling().getId();
        this.typeTransport = sellOrder.getTypeTransport();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDayCreate() {
        return dayCreate;
    }

    public void setDayCreate(LocalDateTime dayCreate) {
        this.dayCreate = dayCreate;
    }

    public LocalDateTime getDayUpdate() {
        return dayUpdate;
    }

    public void setDayUpdate(LocalDateTime dayUpdate) {
        this.dayUpdate = dayUpdate;
    }

    public SellOrderStatus getSellOrderStatus() {
        return sellOrderStatus;
    }

    public void setSellOrderStatus(SellOrderStatus sellOrderStatus) {
        this.sellOrderStatus = sellOrderStatus;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public Integer getSchedulingId() {
        return schedulingId;
    }

    public void setSchedulingId(Integer schedulingId) {
        this.schedulingId = schedulingId;
    }

    public TypeTransport getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(TypeTransport typeTransport) {
        this.typeTransport = typeTransport;
    }
}
