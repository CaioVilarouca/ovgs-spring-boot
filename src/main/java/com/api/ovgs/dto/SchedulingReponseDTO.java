package com.api.ovgs.dto;

import com.api.ovgs.domain.SchedulingStatus;
import com.api.ovgs.entity.Scheduling;

import java.time.LocalDate;
import java.time.LocalTime;

public class SchedulingReponseDTO {

    private Integer id;

    private LocalDate diaDelivery;

    private SchedulingStatus schedulingStatus;

    public SchedulingReponseDTO(Scheduling scheduling) {
        this.id = scheduling.getId();
        this.diaDelivery = scheduling.getDateDelivery();
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

    public SchedulingStatus getSchedulingStatus() {
        return schedulingStatus;
    }

    public void setSchedulingStatus(SchedulingStatus schedulingStatus) {
        this.schedulingStatus = schedulingStatus;
    }
}
