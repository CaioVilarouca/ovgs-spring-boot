package com.api.ovgs.repository;

import com.api.ovgs.entity.OrdemVenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellOrderRepository extends JpaRepository<OrdemVenda,Integer> {
}
