package com.api.ovgs.dto;

import com.api.ovgs.domain.SchedulingStatus;
import com.api.ovgs.entity.Scheduling;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class SchedulingResquetDTO {

    private Integer id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateDelivery;

    private SchedulingStatus schedulingStatus;

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

    public Scheduling toEntity() {
        return new Scheduling(null, this.dateDelivery, SchedulingStatus.PENDENTE.getKey());
    }
}
