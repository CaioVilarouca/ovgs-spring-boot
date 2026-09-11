package com.api.ovgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.ovgs.entity.Scheduling;

@Repository
public interface SchedulingRepository extends JpaRepository<Scheduling, Integer>{

}
