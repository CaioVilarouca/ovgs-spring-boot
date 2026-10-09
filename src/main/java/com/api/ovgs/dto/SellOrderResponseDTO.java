package com.api.ovgs.dto;

import com.api.ovgs.domain.SellOrderStatus;
import com.api.ovgs.entity.*;

public class SellOrderResponseDTO {

    private Integer id;

    private SellOrderStatus sellOrderStatus;

    private Integer clientId;

    private String clientName;

    public SellOrderResponseDTO(SellOrder sellOrder) {
        this.id = sellOrder.getId();
        this.sellOrderStatus = sellOrder.getSellOrderStatus();
        this.clientId = sellOrder.getClient().getId();
        this.clientName = sellOrder.getClient().getName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SellOrderStatus getSellOrderStatus() {
        return sellOrderStatus;
    }

    public void setSellOrderStatus(SellOrderStatus sellOrderStatus) {
        this.sellOrderStatus = sellOrderStatus;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
