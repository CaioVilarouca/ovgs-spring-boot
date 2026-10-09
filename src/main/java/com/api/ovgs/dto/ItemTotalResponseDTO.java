package com.api.ovgs.dto;

import java.util.List;

public class ItemTotalResponseDTO {

    private List<ItemReponseDTO> items;
    private Double total;

    public ItemTotalResponseDTO(List<ItemReponseDTO> items, Double total) {
        this.items = items;
        this.total = total;
    }

    public List<ItemReponseDTO> getItems() {
        return items;
    }

    public Double getTotal() {
        return total;
    }
}