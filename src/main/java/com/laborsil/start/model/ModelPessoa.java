package com.laborsil.start.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Pessoa")
public class ModelPessoa {

	/*
	CÓDIGO DA PESSOA
	Categoria de PESSOA = FÍSICA OU JURÍDICA
	﻿Nome e Sobrenome
	﻿CPF
	﻿NUMERO RG
	﻿DATA NASCIMENTO
	﻿DATA DE CADASTRO
	﻿TELEFONE
	﻿TELEFONE FIXO
	﻿SEXO
	 */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CodPessoa")
	private Long id;
	
	@Column(name = "CategoriaPessoa")
	private String categoriaPessoa;
	
	@Column(name = "NomeCompleto")
	private String nomeCompleto;
	
	@Column(name = "Cpf")
	private String cpf;
	
	@Column(name = "NumeroRg")
	private Long numeroRg;
	
	@Column(name = "DataNascimento")
	private String dataNascimento;
	
	@Column(name = "DataCadastro")
	private String dataCadastro;
	
	@Column(name = "Sexo")
	private String sexo;
	
	@Column(name="Telefone")
	private String telefone;
	
	@Column(name="TelefoneFixo")
	private String telefoneFixo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoriaPessoa() {
		return categoriaPessoa;
	}

	public void setCategoriaPessoa(String categoriaPessoa) {
		this.categoriaPessoa = categoriaPessoa;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Long getNumeroRg() {
		return numeroRg;
	}

	public void setNumeroRg(Long numeroRg) {
		this.numeroRg = numeroRg;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	
}
