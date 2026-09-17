package com.api.ovgs.dto;


import com.api.ovgs.entity.Cliente;

public class ClienteResponseDTO {

    private Integer id;
    private String name;
    private String document;
    private String email;
    private boolean active;

    public ClienteResponseDTO(Cliente clienteNewSave) {
        this.id = clienteNewSave.getId();
        this.name = clienteNewSave.getName();
        this.document = clienteNewSave.getDocument();
        this.email = clienteNewSave.getEmail();
        this.active = clienteNewSave.isActive();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return active;
    }
}
