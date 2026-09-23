package com.api.ovgs.entity;

import com.api.ovgs.domain.SchedulingStatus;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="tb_agendamento")
public class Scheduling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    //@JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateDelivery;

    @Column(nullable = false)
    private LocalTime windowsStart;

    @Column(nullable = false)
    private LocalTime windowsFinish;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SchedulingStatus schedulingStatus;

    public Scheduling(){}

    public Scheduling(Integer id, LocalDate dateDelivery, LocalTime windowsStart, LocalTime windowsFinish, SchedulingStatus schedulingStatus) {
        this.id = id;
        this.dateDelivery = dateDelivery;
        this.windowsStart = windowsStart;
        this.windowsFinish = windowsFinish;
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

    public LocalTime getWindowsStart() {
        return windowsStart;
    }

    public void setWindowsStart(LocalTime windowsStart) {
        this.windowsStart = windowsStart;
    }

    public LocalTime getWindowsFinish() {
        return windowsFinish;
    }

    public void setWindowsFinish(LocalTime windowsFinish) {
        this.windowsFinish = windowsFinish;
    }

    public SchedulingStatus getSchedulingStatus() {
        return schedulingStatus;
    }

    public void setSchedulingStatus(SchedulingStatus schedulingStatus) {
        this.schedulingStatus = schedulingStatus;
    }
}
