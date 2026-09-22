package com.api.ovgs.dto;

import com.api.ovgs.entity.TipoTransporte;
import jakarta.persistence.Column;

public class TipoTransporteResponseDTO {

    private Integer id;

    private String nome;

    private String descricao;

    private boolean ativo;

    public TipoTransporteResponseDTO(TipoTransporte tipoTransporte) {
        this.id = tipoTransporte.getId();
        this.nome = tipoTransporte.getNome();
        this.descricao = tipoTransporte.getDescricao();
        this.ativo = tipoTransporte.isAtivo();
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
