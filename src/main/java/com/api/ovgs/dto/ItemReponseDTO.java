package com.api.ovgs.dto;

import com.api.ovgs.entity.Item;

public class ItemReponseDTO {

    private Integer id;

    private String name;

    private String description;

    private String sku;

    private boolean active;

    private Double price;

    private Integer amount;

    private Double subtotal;

    private Double total;

    public ItemReponseDTO(Item item) {
        this.id = item.getId();
        this.name = item.getName();
        this.description = item.getDescription();
        this.sku = item.getSku();
        this.active = item.isActive();
        this.price = item.getPrice();
        this.amount = item.getAmount();
        // Calculando subtotal
        this.subtotal = item.getPrice() * item.getAmount();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
}
