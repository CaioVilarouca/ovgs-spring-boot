package com.api.ovgs.repository;

import com.api.ovgs.entity.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchedulingRepository extends JpaRepository<Agendamento, Integer> {
}
