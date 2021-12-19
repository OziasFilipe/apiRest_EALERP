package com.laborsil.start.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Armazem")
public class ModelArmazem {

	/*
﻿Código do Armazém
Nome do Armazém
Quantidade a armazenar
Amplitude 
Localização 
Custos do Armazém﻿
Descrição do armazém
Código Pessoa
	 */


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CodArmazem")
	private Long id;
	
	@Column(name = "NomeArmazem")
	private String nomeArmazem;
	
	@Column(name = "QuantArmazem")
	private int quantArmazem;
	
	@Column(name = "Amplitude")
	private  int amplitude;
	
	@Column(name = "Localizacao")
	private String localização;
	
	@Column(name = "Custos")
	private String custos;
	
	@Column(name = "DescricaoArmazem")
	private String descricaoArmazem;
	
	@Column(name = "CodPessoa")
	private Long codPessoa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeArmazem() {
		return nomeArmazem;
	}

	public void setNomeArmazem(String nomeArmazem) {
		this.nomeArmazem = nomeArmazem;
	}

	public int getQuantArmazem() {
		return quantArmazem;
	}

	public void setQuantArmazem(int quantArmazem) {
		this.quantArmazem = quantArmazem;
	}

	public int getAmplitude() {
		return amplitude;
	}

	public void setAmplitude(int amplitude) {
		this.amplitude = amplitude;
	}

	public String getLocalização() {
		return localização;
	}

	public void setLocalização(String localização) {
		this.localização = localização;
	}

	public String getCustos() {
		return custos;
	}

	public void setCustos(String custos) {
		this.custos = custos;
	}

	public String getDescricaoArmazem() {
		return descricaoArmazem;
	}

	public void setDescricaoArmazem(String descricaoArmazem) {
		this.descricaoArmazem = descricaoArmazem;
	}

	public Long getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(Long codPessoa) {
		this.codPessoa = codPessoa;
	}

	
}
