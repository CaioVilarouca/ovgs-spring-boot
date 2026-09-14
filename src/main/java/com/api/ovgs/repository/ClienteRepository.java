package com.api.ovgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.ovgs.entity.Cliente;

@Repository // Uma interface para acessar o banco de dados
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
