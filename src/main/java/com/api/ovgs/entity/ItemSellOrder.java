package com.api.ovgs.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tb_itemSellOrder")
public class ItemSellOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer amount;

    @Column(nullable = false)
    private Double price;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    public ItemSellOrder() {}

    public ItemSellOrder(Integer id, Integer amount, Double price, Item item) {
        this.id = id;
        this.amount = amount;
        this.price = price;
        this.item = item;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    /* Sub Total
    public double subTotal() {
        return price * amount;
    }*/
}
