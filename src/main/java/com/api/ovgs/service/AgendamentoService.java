package com.api.ovgs.service;

import com.api.ovgs.dto.AgendamentoReponseDTO;
import com.api.ovgs.dto.AgendamentoResquetDTO;
import com.api.ovgs.entity.Agendamento;
import com.api.ovgs.repository.AgendamentoRepository;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

@Service
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    public AgendamentoService(AgendamentoRepository agendamentoRepository) {
        this.agendamentoRepository = agendamentoRepository;
    }

    public AgendamentoReponseDTO criarAgendamento(@NotNull AgendamentoResquetDTO agendamentoResquetDTO){
        return new AgendamentoReponseDTO(agendamentoRepository.save(agendamentoResquetDTO.agendamentoEntidade()));
    }
}
