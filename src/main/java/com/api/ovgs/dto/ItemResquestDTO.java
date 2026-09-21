package com.api.ovgs.dto;

import com.api.ovgs.entity.Item;

public class ItemResquestDTO {

    private Integer id;

    private String nome;

    private String descricao;

    private boolean ativo;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Item itemEntidade() {
        return new Item(null, this.nome, this.descricao, this.ativo);
    }
}
