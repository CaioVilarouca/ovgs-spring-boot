package com.api.ovgs.service;

import com.api.ovgs.dto.SchedulingReponseDTO;
import com.api.ovgs.dto.SchedulingResquetDTO;
import com.api.ovgs.entity.Agendamento;
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
        Agendamento request = schedulingResquetDTO.toScheduling();
        Agendamento save = schedulingRepository.save(request);
        SchedulingReponseDTO reponse = new SchedulingReponseDTO(save);
        return reponse;
        //return new SchedulingReponseDTO(schedulingRepository.save(schedulingResquetDTO.toScheduling()));
    }
}
