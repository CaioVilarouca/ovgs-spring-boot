package com.api.ovgs.dto;

import com.api.ovgs.entity.Item;
import com.api.ovgs.entity.ItemSellOrder;

public class ItemSellOrderRequestDTO {

    private Integer id;
    private Integer amount;
    private Double price;
    private Item item;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public ItemSellOrder toItemSellOrder(){
        return new ItemSellOrder(null, this.amount, this.price, this.item);
    }
}
