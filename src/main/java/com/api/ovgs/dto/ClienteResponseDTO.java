package com.api.ovgs.dto;


import com.api.ovgs.entity.Cliente;

public class ClienteResponseDTO {

    private Integer id;
    private String name;
    private String document;
    private String email;
    private boolean active;

    public ClienteResponseDTO(Integer id, String document, String name, boolean active, String email) {
        this.id = id;
        this.document = document;
        this.name = name;
        this.active = active;
        this.email = email;
    }

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

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
