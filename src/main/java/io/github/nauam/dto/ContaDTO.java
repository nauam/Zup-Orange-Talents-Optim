package io.github.nauam.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.github.nauam.service.validation.ContaInsert;

@ContaInsert
public class ContaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotEmpty(message = "Nome - Preenchimento obrigatório.")
	@Length(min = 5, max = 120, message = "Nome está inválido.")
	private String nome;

	@NotEmpty(message = "Email - Preenchimento obrigatório.")
	@Email(message = "Email está inválido.")
	private String email;

	@NotEmpty(message = "CPF - Preenchimento obrigatório.")
	@CPF(message = "CPF está inválido.")
	private String cpf;

	@JsonFormat(pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "Brazil/East")
	@NotNull(message = "Data de nascimento - Preenchimento obrigatório.")
	@Past(message = "Data de nascimento está inválido.")
	private Date dataNascimento;

	public ContaDTO() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}