package com.api.ovgs.dto;

import com.api.ovgs.entity.Item;

public class ItemResquestDTO {

    private Integer id;
    private String name;
    private String description;
    private boolean active;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Item toItem() {
        return new Item(null, this.name, this.description, this.active);
    }
}
