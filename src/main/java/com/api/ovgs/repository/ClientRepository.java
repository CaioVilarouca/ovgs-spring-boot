package com.api.ovgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.ovgs.entity.Client;

@Repository // Uma interface para acessar o banco de dados
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
