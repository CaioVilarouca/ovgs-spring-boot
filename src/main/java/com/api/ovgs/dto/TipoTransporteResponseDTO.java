package com.api.ovgs.dto;

import com.api.ovgs.entity.TypeTransport;

public class TipoTransporteResponseDTO {

    private Integer id;

    private String nome;

    private String descricao;

    private boolean ativo;

    public TipoTransporteResponseDTO(TypeTransport typeTransport) {
        this.id = typeTransport.getId();
        this.nome = typeTransport.getNome();
        this.descricao = typeTransport.getDescricao();
        this.ativo = typeTransport.isAtivo();
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
