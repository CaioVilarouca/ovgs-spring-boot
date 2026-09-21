package com.api.ovgs.service;

import com.api.ovgs.dto.AgendamentoReponseDTO;
import com.api.ovgs.dto.AgendamentoResquetDTO;
import com.api.ovgs.entity.Agendamento;
import com.api.ovgs.repository.AgendamentoRepository;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

@Service
public class SchedulingService {

    private final AgendamentoRepository schedulingRepository;

    public SchedulingService(AgendamentoRepository agendamentoRepository) {
        this.schedulingRepository = agendamentoRepository;
    }

   public AgendamentoReponseDTO createNewScheduling(@NotNull AgendamentoResquetDTO schedulingResquetDTO){
        Agendamento request = schedulingResquetDTO.toScheduling();
        Agendamento save = schedulingRepository.save(request);
        AgendamentoReponseDTO reponse = new AgendamentoReponseDTO(save);
        return reponse;
        //return new AgendamentoReponseDTO(schedulingRepository.save(schedulingResquetDTO.toScheduling()));
    }
}
