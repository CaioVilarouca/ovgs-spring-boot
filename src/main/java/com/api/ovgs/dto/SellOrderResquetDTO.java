package com.api.ovgs.dto;

import com.api.ovgs.domain.SellOrderStatus;
import com.api.ovgs.entity.*;

public class SellOrderResquetDTO {

    private Integer id;

    private SellOrderStatus sellOrderStatus;


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

    public SellOrder toEntity() {
        return new SellOrder(null, SellOrderStatus.CRIADO.getKey());
    }
}
