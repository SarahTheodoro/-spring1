package com.senai.sarah.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.sarah.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
}
