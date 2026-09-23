package com.api.ovgs.repository;

import com.api.ovgs.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Uma interface para acessar o banco de dados
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
