package com.laborsil.start.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Produto")
public class ModelProduto {

	/*
	 Código do produto
	﻿ Nome do produto
	﻿ Quantidade de produto
	﻿ Valor do produto

	 */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CodProduto")
	private Long id;
	
	@Column(name = "NomeProduto")
	private String nomeProduto;
	
	@Column(name = "QuantProduto")
	private String quantProduto;
	
	@Column(name = "ValorProduto")
	private Float valorProduto;

	@Column(name = "CodArmazem")
	private Long codArmazem;
	
	@Column(name = "DateEntrada")
	private String dateEntrada;
	
	@Column(name = "DateVencimento")
	private String dateVencimento;
	

	public String getDateEntrada() {
		return dateEntrada;
	}

	public void setDateEntrada(String dateEntrada) {
		this.dateEntrada = dateEntrada;
	}

	public String getDateVencimento() {
		return dateVencimento;
	}

	public void setDateVencimento(String dateVencimento) {
		this.dateVencimento = dateVencimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getQuantProduto() {
		return quantProduto;
	}

	public void setQuantProduto(String quantProduto) {
		this.quantProduto = quantProduto;
	}

	public Float getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(Float valorProduto) {
		this.valorProduto = valorProduto;
	}

	public Long getCodArmazem() {
		return codArmazem;
	}

	public void setCodArmazem(Long codArmazem) {
		this.codArmazem = codArmazem;
	}
	
	
	
	
}
