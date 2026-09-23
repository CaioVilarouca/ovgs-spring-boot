package com.api.ovgs.dto;

import com.api.ovgs.entity.TypeTransport;

public class TypeTransportRequestDTO {

    private Integer id;

    private String name;

    private String description;

    private boolean active;

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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public TypeTransport toEntity() {
        return new TypeTransport(null, this.name, this.description, this.active);
    }
}
