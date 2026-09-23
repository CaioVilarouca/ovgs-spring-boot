package com.api.ovgs.dto;

import com.api.ovgs.domain.SchedulingStatus;
import com.api.ovgs.entity.Scheduling;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.LocalTime;

public class SchedulingResquetDTO {

    private Integer id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateDelivery;

    private LocalTime windowsStart;

    private LocalTime windowsFinish;

    private SchedulingStatus schedulingStatus;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
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

    public Scheduling toEntity() {
        return new Scheduling(null, this.dateDelivery, this.windowsStart, this.windowsFinish, this.schedulingStatus);
    }
}
