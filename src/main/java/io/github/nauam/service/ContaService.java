package io.github.nauam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.nauam.dto.ContaDTO;
import io.github.nauam.model.Conta;
import io.github.nauam.repository.ContaRepository;

@Service
public class ContaService {

	@Autowired
	private ContaRepository repository;

	public Conta insert(Conta obj) {
		obj.setId(null);
		return repository.save(obj);
	}

	public Conta fromDTO(ContaDTO objDto) {
		return new Conta(null, objDto.getNome(), objDto.getEmail(), objDto.getCpf(), objDto.getDataNascimento());
	}
	
}