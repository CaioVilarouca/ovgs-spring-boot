package com.api.ovgs.dto;

import com.api.ovgs.domain.SellOrderStatus;
import com.api.ovgs.entity.*;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.List;

public class SellOrderResquetDTO {

    private Integer id;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime dayCreate;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime dayUpdate;

    private SellOrderStatus sellOrderStatus;

    private Integer clienteId;

    private List<Item> item;

    private Integer schedulingId;

    private Integer typeTransportId;

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

    public Integer getTypeTransportId() {
        return typeTransportId;
    }

    public void setTypeTransportId(Integer typeTransportId) {
        this.typeTransportId = typeTransportId;
    }

    public SellOrder toEntity(Client client, Scheduling scheduling, TypeTransport typeTransport) {
        return new SellOrder(typeTransport, scheduling, null, client, this.sellOrderStatus, this.dayUpdate, this.dayCreate, null);
    }
}
