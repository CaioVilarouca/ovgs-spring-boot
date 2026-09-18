package com.api.ovgs.dto;

import com.api.ovgs.domain.StatusSellOrder;
import com.api.ovgs.entity.*;

import java.time.LocalDateTime;
import java.util.List;

public class SellOrderResquetDTO {

    private Integer id;

    private LocalDateTime dayCreate;

    private LocalDateTime dayUpdate;

    private StatusSellOrder statusSellOrder;

    private Integer clienteId;

    private List<Item> item;

    private Scheduling scheduling;

    private TypeTransport typeTransport;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDayCreate(LocalDateTime dayCreate) {
        this.dayCreate = dayCreate;
    }

    public void setDayUpdate(LocalDateTime dayUpdate) {
        this.dayUpdate = dayUpdate;
    }

    public void setStatusSellOrder(StatusSellOrder statusSellOrder) {
        this.statusSellOrder = statusSellOrder;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public void setScheduling(Scheduling scheduling) {
        this.scheduling = scheduling;
    }

    public void setTypeTransport(TypeTransport typeTransport) {
        this.typeTransport = typeTransport;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public SellOrder toSellOrder(Cliente cliente) {

        //return new SellOrder(null, this.dayCreate, this.dayUpdate, this.statusSellOrder, cliente, this.item, this.scheduling, this.typeTransport);
        return new SellOrder(null, this.dayCreate, this.dayUpdate, this.statusSellOrder, cliente, null, null, null);

    }
}
