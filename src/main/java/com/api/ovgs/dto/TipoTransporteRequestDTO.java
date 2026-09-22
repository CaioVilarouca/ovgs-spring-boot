package com.api.ovgs.dto;

import com.api.ovgs.entity.TipoTransporte;

public class TipoTransporteRequestDTO {

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

    public TipoTransporte tipoTransporteEntidade() {
        return new TipoTransporte(null, this.nome, this.descricao, this.ativo);
    }
}
