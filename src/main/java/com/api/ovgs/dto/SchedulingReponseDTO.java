package com.api.ovgs.dto;

import com.api.ovgs.domain.SchedulingStatus;
import com.api.ovgs.entity.Scheduling;

import java.time.LocalDate;
import java.time.LocalTime;

public class SchedulingReponseDTO {

    private Integer id;

    private LocalDate diaDelivery;

    private LocalTime windowsStart;

    private LocalTime windowsFinish;

    private SchedulingStatus schedulingStatus;

    public SchedulingReponseDTO(Scheduling scheduling) {
        this.id = scheduling.getId();
        this.diaDelivery = scheduling.getDateDelivery();
        this.windowsStart = scheduling.getWindowsStart();
        this.windowsFinish = scheduling.getWindowsFinish();
        this.schedulingStatus = scheduling.getSchedulingStatus();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDiaDelivery() {
        return diaDelivery;
    }

    public void setDiaDelivery(LocalDate diaDelivery) {
        this.diaDelivery = diaDelivery;
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
