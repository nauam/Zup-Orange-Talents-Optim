package io.github.nauam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.github.nauam.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {
	
	@Transactional(readOnly = true)
	Conta findByCpf(String cpf);

	@Transactional(readOnly = true)
	Conta findByEmail(String email);
	
}