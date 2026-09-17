package com.api.ovgs.entity;

import com.api.ovgs.domain.StatusScheduling;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name="tb_scheduling")
public class Scheduling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private LocalDate dayDelivery;

    @Column(nullable = false)
    private LocalTime windowsStar;

    @Column(nullable = false)
    private LocalTime windowsFinish;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusScheduling statusScheduling;

    public Scheduling(){}

    public Scheduling(Integer id, LocalDate dayDelivery, LocalTime windowsStar, LocalTime windowsFinish, StatusScheduling statusScheduling) {
        this.id = id;
        this.dayDelivery = dayDelivery;
        this.windowsStar = windowsStar;
        this.windowsFinish = windowsFinish;
        this.statusScheduling = statusScheduling;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDayDelivery() {
        return dayDelivery;
    }

    public void setDayDelivery(LocalDate dayDelivery) {
        this.dayDelivery = dayDelivery;
    }

    public LocalTime getWindowsStar() {
        return windowsStar;
    }

    public void setWindowsStar(LocalTime windowsStar) {
        this.windowsStar = windowsStar;
    }

    public LocalTime getWindowsFinish() {
        return windowsFinish;
    }

    public void setWindowsFinish(LocalTime windowsFinish) {
        this.windowsFinish = windowsFinish;
    }

    public StatusScheduling getStatusScheduling() {
        return statusScheduling;
    }

    public void setStatusScheduling(StatusScheduling statusScheduling) {
        this.statusScheduling = statusScheduling;
    }
}
