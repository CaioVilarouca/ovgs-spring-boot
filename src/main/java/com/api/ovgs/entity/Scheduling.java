package com.api.ovgs.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import com.api.ovgs.domain.StatusScheduling;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_scheduling")
public class Scheduling { // Agendamento  
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    
    @Column(nullable = false)
	private LocalDate dateDelivery;
    
    @Column(nullable = false)
	private LocalTime timeStar;
    
    @Column(nullable = false)
	private LocalTime timeFinish;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
	private StatusScheduling statusScheduling;
    
    public Scheduling() {}

	public Scheduling(Integer id, LocalDate dateDelivery, LocalTime timeStar, LocalTime timeFinish,
			StatusScheduling statusScheduling) {
		super();
		this.id = id;
		this.dateDelivery = dateDelivery;
		this.timeStar = timeStar;
		this.timeFinish = timeFinish;
		this.statusScheduling = statusScheduling;
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

	public LocalTime getTimeStar() {
		return timeStar;
	}

	public void setTimeStar(LocalTime timeStar) {
		this.timeStar = timeStar;
	}

	public LocalTime getTimeFinish() {
		return timeFinish;
	}

	public void setTimeFinish(LocalTime timeFinish) {
		this.timeFinish = timeFinish;
	}

	public StatusScheduling getStatusScheduling() {
		return statusScheduling;
	}

	public void setStatusScheduling(StatusScheduling statusScheduling) {
		this.statusScheduling = statusScheduling;
	}
}
