package com.api.ovgs.dto;

import com.api.ovgs.entity.Client;

public class ClientResquestDTO {

    private Integer id;

    private String name;

    private String email;

    private boolean active;


    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client toEntity(){
        return new Client(null, this.name, this.email, this.active);
    }
}
