package com.api.ovgs.service;

import com.api.ovgs.dto.SchedulingReponseDTO;
import com.api.ovgs.dto.SchedulingResquetDTO;
import com.api.ovgs.entity.Scheduling;
import com.api.ovgs.repository.SchedulingRepository;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SchedulingService {

    private final SchedulingRepository schedulingRepository;

    public SchedulingService(SchedulingRepository schedulingRepository) {
        this.schedulingRepository = schedulingRepository;
    }

    public SchedulingReponseDTO createScheduling(@NotNull SchedulingResquetDTO schedulingResquetDTO){
        return new SchedulingReponseDTO(schedulingRepository.save(schedulingResquetDTO.toEntity()));
    }

    // Pode ou não retorna alguma coisa
    public Optional<Scheduling> findById(Integer id) {
        return schedulingRepository.findById(id);
    }
}
