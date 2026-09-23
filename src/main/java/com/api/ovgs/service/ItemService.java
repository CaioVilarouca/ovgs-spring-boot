package com.api.ovgs.service;

import com.api.ovgs.dto.ItemReponseDTO;
import com.api.ovgs.dto.ItemResquestDTO;
import com.api.ovgs.repository.ItemRepository;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public ItemReponseDTO createItem(@NotNull ItemResquestDTO itemResquestDTO) {
        return new ItemReponseDTO(itemRepository.save(itemResquestDTO.itemEntidade()));
    }
}
