package com.api.ovgs.dto;

import com.api.ovgs.entity.Item;

public class ItemResquestDTO {

    private Integer id;

    private String name;

    private String description;

    private boolean active;

    public ItemResquestDTO(Integer id, String name, String description, boolean active) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.active = active;
    }

    public Item itemEntidade() {
        return new Item(null, this.name, this.description, this.active);
    }
}
