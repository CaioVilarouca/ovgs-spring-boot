package com.api.ovgs.dto;

import com.api.ovgs.domain.AgendamentoStatus;
import com.api.ovgs.entity.Agendamento;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.LocalTime;

public class AgendamentoReponseDTO {

    private Integer id;

    //@JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate diaEntrega;

    private LocalTime janelaInicio;

    private LocalTime janelaFim;

    private AgendamentoStatus agendamentoStatus;

    public AgendamentoReponseDTO(Agendamento agendamento) {
        this.id = agendamento.getId();
        this.diaEntrega = agendamento.getDiaEntrega();
        this.janelaInicio = agendamento.getJanelaInicio();
        this.janelaFim = agendamento.getJanelaFim();
        this.agendamentoStatus = agendamento.getAgendamentoStatus();
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getDiaEntrega() {
        return diaEntrega;
    }

    public LocalTime getJanelaInicio() {
        return janelaInicio;
    }

    public LocalTime getJanelaFim() {
        return janelaFim;
    }

    public AgendamentoStatus getAgendamentoStatus() {
        return agendamentoStatus;
    }
}
