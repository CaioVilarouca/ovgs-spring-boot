package com.api.ovgs.dto;

import com.api.ovgs.domain.AgendamentoStatus;
import com.api.ovgs.entity.Agendamento;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.LocalTime;

public class AgendamentoResquetDTO {

    private Integer id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate diaEntrega;

    private LocalTime janelaInicio;

    private LocalTime janelaFim;

    private AgendamentoStatus agendamentoStatus;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDiaEntrega(LocalDate diaEntrega) {
        this.diaEntrega = diaEntrega;
    }

    public void setJanelaInicio(LocalTime janelaInicio) {
        this.janelaInicio = janelaInicio;
    }

    public void setJanelaFim(LocalTime janelaFim) {
        this.janelaFim = janelaFim;
    }

    public void setAgendamentoStatus(AgendamentoStatus agendamentoStatus) {
        this.agendamentoStatus = agendamentoStatus;
    }

    public Agendamento toScheduling() {
        return new Agendamento(null, this.diaEntrega, this.janelaInicio, this.janelaFim, this.agendamentoStatus);
    }
}
