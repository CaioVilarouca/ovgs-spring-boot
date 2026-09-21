package com.api.ovgs.dto;

import com.api.ovgs.entity.Item;

public class ItemReponseDTO {

    private Integer id;

    private String nome;

    private String descricao;

    private boolean ativo;

    public ItemReponseDTO(Item item) {
        this.id = item.getId();
        this.nome = item.getNome();
        this.descricao = item.getDescricao();
        this.ativo = item.isAtivo();
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isAtivo() {
        return ativo;
    }
}
