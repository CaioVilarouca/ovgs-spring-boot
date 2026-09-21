package com.api.ovgs.dto;

import com.api.ovgs.entity.Cliente;

public class ClienteResponseDTO {

    private Integer id;

    private String nome;

    private String documento;

    private String email;

    private boolean ativo;

    public ClienteResponseDTO(Cliente cliente) {
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.documento = cliente.getDocumento();
        this.email = cliente.getEmail();
        this.ativo = cliente.isAtivo();
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAtivo() {
        return ativo;
    }
}
