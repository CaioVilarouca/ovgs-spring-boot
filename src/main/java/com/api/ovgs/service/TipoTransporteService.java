package com.api.ovgs.service;

import com.api.ovgs.dto.TipoTransporteRequestDTO;
import com.api.ovgs.dto.TipoTransporteResponseDTO;
import com.api.ovgs.entity.TipoTransporte;
import com.api.ovgs.repository.TipoTransporteRepository;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TipoTransporteService {

    private final TipoTransporteRepository tipoTransporteRepository;

    public TipoTransporteService(TipoTransporteRepository tipoTransporteRepository) {
        this.tipoTransporteRepository = tipoTransporteRepository;
    }

    public TipoTransporteResponseDTO criarTipoTransporte(@NotNull TipoTransporteRequestDTO tipoTransporteRequestDTO) {
        return new TipoTransporteResponseDTO(tipoTransporteRepository.save(tipoTransporteRequestDTO.tipoTransporteEntidade()));
    }

    // Pode ou não retorna alguma coisa
    public Optional<TipoTransporte> findById(Integer id) {
        return tipoTransporteRepository.findById(id);
    }
}
