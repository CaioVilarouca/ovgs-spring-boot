package com.api.ovgs.controller;

import com.api.ovgs.dto.AgendamentoReponseDTO;
import com.api.ovgs.dto.AgendamentoResquetDTO;
import com.api.ovgs.service.AgendamentoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/agendamento")
public class AgendamentoController {

    private final AgendamentoService agendamentoService;

    public AgendamentoController(AgendamentoService agendamentoService) {
        this.agendamentoService = agendamentoService;
    }

    @PostMapping
    public AgendamentoReponseDTO criar(@RequestBody AgendamentoResquetDTO agendamentoResquetDTO){
        return agendamentoService.criarAgendamento(agendamentoResquetDTO);
    }
}
