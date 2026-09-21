package com.api.ovgs.entity;

import com.api.ovgs.domain.AgendamentoStatus;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="tb_agendamento")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private LocalDate diaEntrega;

    @Column(nullable = false)
    private LocalTime janelaInicio;

    @Column(nullable = false)
    private LocalTime janelaFim;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AgendamentoStatus agendamentoStatus;

    public Agendamento(){}

    public Agendamento(Integer id, LocalDate diaEntrega, LocalTime janelaInicio, LocalTime janelaFim, AgendamentoStatus agendamentoStatus) {
        this.id = id;
        this.diaEntrega = diaEntrega;
        this.janelaInicio = janelaInicio;
        this.janelaFim = janelaFim;
        this.agendamentoStatus = agendamentoStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDiaEntrega() {
        return diaEntrega;
    }

    public void setDiaEntrega(LocalDate diaEntrega) {
        this.diaEntrega = diaEntrega;
    }

    public LocalTime getJanelaInicio() {
        return janelaInicio;
    }

    public void setJanelaInicio(LocalTime janelaInicio) {
        this.janelaInicio = janelaInicio;
    }

    public LocalTime getJanelaFim() {
        return janelaFim;
    }

    public void setJanelaFim(LocalTime janelaFim) {
        this.janelaFim = janelaFim;
    }

    public AgendamentoStatus getAgendamentoStatus() {
        return agendamentoStatus;
    }

    public void setAgendamentoStatus(AgendamentoStatus agendamentoStatus) {
        this.agendamentoStatus = agendamentoStatus;
    }
}
