package com.api.ovgs.dto;

import com.api.ovgs.entity.Item;

public class ItemReponseDTO {

    private Integer id;
    private String name;
    private String description;
    private boolean active;

    public ItemReponseDTO(Item itemNewSave) {
        this.id = itemNewSave.getId();
        this.name = itemNewSave.getName();
        this.description = itemNewSave.getDescription();
        this.active = itemNewSave.isActive();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isActive() {
        return active;
    }
}
