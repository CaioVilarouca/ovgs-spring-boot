package com.api.ovgs.dto;

import com.api.ovgs.entity.Item;
import com.api.ovgs.entity.ItemSellOrder;

public class ItemSellOrderReponseDTO {

    private Integer id;
    private Integer amount;
    private Double price;
    private Item item;

    public ItemSellOrderReponseDTO(ItemSellOrder itemSellOrder){
        this.id = itemSellOrder.getId();
        this.amount = itemSellOrder.getAmount();
        this.price = itemSellOrder.getPrice();
        this.item = itemSellOrder.getItem();
    }

    public Integer getId() {
        return id;
    }

    public Integer getAmount() {
        return amount;
    }

    public Double getPrice() {
        return price;
    }

    public Item getItem() {
        return item;
    }
}
