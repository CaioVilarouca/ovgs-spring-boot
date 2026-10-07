package com.api.ovgs.entity;

import com.api.ovgs.domain.SchedulingStatus;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="tb_agendamento")
public class Scheduling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private LocalDate dateDelivery;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SchedulingStatus schedulingStatus;

    public Scheduling(){}

    public Scheduling(Integer id, LocalDate dateDelivery, SchedulingStatus schedulingStatus) {
        this.id = id;
        this.dateDelivery = dateDelivery;
        this.schedulingStatus = schedulingStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(LocalDate dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

    public SchedulingStatus getSchedulingStatus() {
        return schedulingStatus;
    }

    public void setSchedulingStatus(SchedulingStatus schedulingStatus) {
        this.schedulingStatus = schedulingStatus;
    }
}
