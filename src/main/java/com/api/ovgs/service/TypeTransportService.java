package com.api.ovgs.service;

import com.api.ovgs.dto.TypeTransportRequestDTO;
import com.api.ovgs.dto.TypeTransportResponseDTO;
import com.api.ovgs.entity.TypeTransport;
import com.api.ovgs.repository.TypeTransportRepository;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TypeTransportService {

    private final TypeTransportRepository typeTransportRepository;

    public TypeTransportService(TypeTransportRepository typeTransportRepository) {
        this.typeTransportRepository = typeTransportRepository;
    }

    public TypeTransportResponseDTO createTypeTransport(@NotNull TypeTransportRequestDTO typeTransportRequestDTO) {
        return new TypeTransportResponseDTO(typeTransportRepository.save(typeTransportRequestDTO.toEntity()));
    }

    // Pode ou não retorna alguma coisa
    public Optional<TypeTransport> findById(Integer id) {
        return typeTransportRepository.findById(id);
    }
}
