package com.api.ovgs.dto;

import com.api.ovgs.domain.StatusScheduling;
import com.api.ovgs.entity.Scheduling;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SchedulingRequestDTO {

    private Integer id;
    private LocalDate dayDelivery;
    private LocalTime windowsStar;
    private LocalTime windowsFinish;
    private StatusScheduling statusScheduling;

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

    public Scheduling toScheduling() {
        return new Scheduling(null, this.dayDelivery, this.windowsStar, this.windowsFinish, this.statusScheduling);
    }
}
