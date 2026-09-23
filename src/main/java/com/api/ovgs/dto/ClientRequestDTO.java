package com.api.ovgs.dto;

import com.api.ovgs.entity.Client;

public class ClientRequestDTO {

    private Integer id;

    private String name;

    private String email;

    private String document;

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

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
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
        return new Client(null, this.name, this.email, this.document, this.active);
    }
}
