package io.github.nauam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.nauam.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {
	
}