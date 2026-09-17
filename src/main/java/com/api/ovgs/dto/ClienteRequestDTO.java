package com.api.ovgs.dto;

import com.api.ovgs.entity.Cliente;

public class ClienteRequestDTO {

    private Integer id;
    private String name;
    private String document;
    private String email;
    private boolean active;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Cliente toEntity(){
        return new Cliente(null, this.name, this.document, this.email, this.active);
    }
}
