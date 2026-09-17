package com.api.ovgs.service;

import com.api.ovgs.dto.SchedulingReponseDTO;
import com.api.ovgs.dto.SchedulingResquetDTO;
import com.api.ovgs.entity.Scheduling;
import com.api.ovgs.repository.SchedulingRepository;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

@Service
public class SchedulingService {

    private final SchedulingRepository schedulingRepository;

    public SchedulingService(SchedulingRepository schedulingRepository) {
        this.schedulingRepository = schedulingRepository;
    }

   public SchedulingReponseDTO createNewScheduling(@NotNull SchedulingResquetDTO schedulingResquetDTO){
        Scheduling request = schedulingResquetDTO.toScheduling();
        Scheduling save = schedulingRepository.save(request);
        SchedulingReponseDTO reponse = new SchedulingReponseDTO(save);
        return reponse;
        //return new SchedulingReponseDTO(schedulingRepository.save(schedulingResquetDTO.toScheduling()));
    }
}
