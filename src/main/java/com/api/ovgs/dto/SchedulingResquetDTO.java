package com.api.ovgs.dto;

import com.api.ovgs.domain.StatusScheduling;
import com.api.ovgs.entity.Scheduling;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.LocalTime;

public class SchedulingResquetDTO {

    private Integer id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dayDelivery;
    private LocalTime windowsStar;
    private LocalTime windowsFinish;
    private StatusScheduling statusScheduling;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDayDelivery(LocalDate dayDelivery) {
        this.dayDelivery = dayDelivery;
    }

    public void setWindowsStar(LocalTime windowsStar) {
        this.windowsStar = windowsStar;
    }

    public void setWindowsFinish(LocalTime windowsFinish) {
        this.windowsFinish = windowsFinish;
    }

    public void setStatusScheduling(StatusScheduling statusScheduling) {
        this.statusScheduling = statusScheduling;
    }

    public Scheduling toScheduling() {
        return new Scheduling(null, this.dayDelivery, this.windowsStar, this.windowsFinish, this.statusScheduling);
    }
}
