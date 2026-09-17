package com.api.ovgs.dto;

import com.api.ovgs.domain.StatusScheduling;
import com.api.ovgs.entity.Scheduling;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.LocalTime;

public class SchedulingReponseDTO {

    private Integer id;

    //@JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dayDelivery;
    private LocalTime windowsStar;
    private LocalTime windowsFinish;
    private StatusScheduling statusScheduling;

    public SchedulingReponseDTO(Scheduling scheduling) {
        this.id = scheduling.getId();
        this.dayDelivery = scheduling.getDayDelivery();
        this.windowsStar = scheduling.getWindowsStar();
        this.windowsFinish = scheduling.getWindowsFinish();
        this.statusScheduling = scheduling.getStatusScheduling();
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getDayDelivery() {
        return dayDelivery;
    }

    public LocalTime getWindowsStar() {
        return windowsStar;
    }

    public LocalTime getWindowsFinish() {
        return windowsFinish;
    }

    public StatusScheduling getStatusScheduling() {
        return statusScheduling;
    }
}
