package com.api.ovgs.service;

import com.api.ovgs.dto.ClientRequestDTO;
import com.api.ovgs.dto.ClientResponseDTO;
import com.api.ovgs.dto.TypeTransportRequestDTO;
import com.api.ovgs.dto.TypeTransportResponseDTO;
import com.api.ovgs.entity.Client;
import com.api.ovgs.entity.TypeTransport;
import com.api.ovgs.exception.FindByIdException;
import com.api.ovgs.repository.TypeTransportRepository;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

import java.util.List;
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

    // Retorna todos os registros pelo IDs
    public List<TypeTransportResponseDTO> findAll() {
        return typeTransportRepository.findAll()
                .stream()
                .map(TypeTransportResponseDTO::new)
                .toList();
    }

    // Atualizar dados de cliente
    public TypeTransportResponseDTO update(Integer id, TypeTransportRequestDTO typeTransportRequestDTO) {

        TypeTransport typeTransport = typeTransportRepository.findById(id).orElseThrow(() -> new FindByIdException("Transporte não encontrado ID= "+id));

        typeTransport.setName(typeTransportRequestDTO.getName());
        typeTransport.setDescription(typeTransportRequestDTO.getDescription());
        typeTransport.setActive(typeTransportRequestDTO.isActive());

        TypeTransport TypeTransportUpdate = typeTransportRepository.save(typeTransport);
        return new TypeTransportResponseDTO(TypeTransportUpdate);
    }
}
