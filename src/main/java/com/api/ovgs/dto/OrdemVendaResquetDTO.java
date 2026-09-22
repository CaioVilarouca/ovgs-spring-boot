package com.api.ovgs.dto;

import com.api.ovgs.domain.OrdemVendaStatus;
import com.api.ovgs.entity.*;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.List;

public class OrdemVendaResquetDTO {

    private Integer id;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime diaCreate;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime diaUpdate;

    private OrdemVendaStatus ordemVendaStatus;

    private Integer clienteId;

    private List<Item> item;

    private Agendamento agendamento;

    private TipoTransporte tipoTransporte;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDiaCreate(LocalDateTime diaCreate) {
        this.diaCreate = diaCreate;
    }

    public void setDiaUpdate(LocalDateTime diaUpdate) {
        this.diaUpdate = diaUpdate;
    }

    public void setOrdemVendaStatus(OrdemVendaStatus ordemVendaStatus) {
        this.ordemVendaStatus = ordemVendaStatus;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    public void setTipoTransporte(TipoTransporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public OrdemVenda ordemVendaIntidade(Cliente cliente) {
        return new OrdemVenda(null, this.diaCreate, this.diaUpdate, this.ordemVendaStatus, cliente, null, null, null);    }
}
