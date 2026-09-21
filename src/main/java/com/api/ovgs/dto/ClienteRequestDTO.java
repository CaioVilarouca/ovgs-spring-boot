package com.api.ovgs.dto;

import com.api.ovgs.entity.Cliente;

public class ClienteRequestDTO {

    private Integer id;

    private String nome;

    private String documento;

    private String email;

    private boolean ativo;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Cliente clienteEntidade(){
        return new Cliente(null, this.nome, this.documento, this.email, this.ativo);
    }
}
