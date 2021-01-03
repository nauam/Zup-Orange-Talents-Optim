package io.github.nauam.service.validation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import io.github.nauam.controller.exception.FieldMessage;
import io.github.nauam.dto.ContaDTO;
import io.github.nauam.model.Conta;
import io.github.nauam.repository.ContaRepository;

public class ContaInsertValidation implements ConstraintValidator<ContaInsert, ContaDTO> {

	@Autowired
	private ContaRepository repo;

	@Override
	public void initialize(ContaInsert ann) {
	}

	@Override
	public boolean isValid(ContaDTO objDto, ConstraintValidatorContext context) {

		List<FieldMessage> list = new ArrayList<>();

		Conta auxCpf = repo.findByCpf(objDto.getCpf());
		if (auxCpf != null) {
			list.add(new FieldMessage("cpf", "CPF já existente"));
		}

		Conta auxEmail = repo.findByEmail(objDto.getEmail());
		if (auxEmail != null) {
			list.add(new FieldMessage("email", "Email já existente"));
		}

		for (FieldMessage e : list) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(e.getMessage())
				   .addPropertyNode(e.getFieldName())
				   .addConstraintViolation();
		}
		return list.isEmpty();
	}
}
