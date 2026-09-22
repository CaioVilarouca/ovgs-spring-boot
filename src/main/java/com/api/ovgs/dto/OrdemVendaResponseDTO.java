package com.api.ovgs.dto;

import com.api.ovgs.domain.OrdemVendaStatus;
import com.api.ovgs.entity.*;

import java.time.LocalDateTime;
import java.util.List;

public class OrdemVendaResponseDTO {

    private Integer id;
    private LocalDateTime diaCreate;
    private LocalDateTime diaUpdate;
    private OrdemVendaStatus ordemVendaStatus;
    private Integer clienteId;

    private List<Item> item;
    private Agendamento agendamento;
    private TipoTransporte tipoTransporte;

    public OrdemVendaResponseDTO(OrdemVenda ordemVenda) {
        this.id = ordemVenda.getId();
        this.diaCreate = ordemVenda.getDiaCreate();
        this.diaUpdate = ordemVenda.getDiaUpdate();
        this.ordemVendaStatus = ordemVenda.getOrdemVendaStatus();
        this.clienteId = ordemVenda.getCliente().getId();
        this.item = ordemVenda.getItem();
        this.agendamento = ordemVenda.getAgendamento();
        this.tipoTransporte = ordemVenda.getTipoTransporte();
    }

    public Integer getId() {
        return id;
    }

    public LocalDateTime getDiaCreate() {
        return diaCreate;
    }

    public LocalDateTime getDiaUpdate() {
        return diaUpdate;
    }

    public OrdemVendaStatus getOrdemVendaStatus() {
        return ordemVendaStatus;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public List<Item> getItem() {
        return item;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public TipoTransporte getTipoTransporte() {
        return tipoTransporte;
    }
}
