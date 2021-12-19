package com.laborsil.start.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "Usuario")
public class ModelUsuario {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CodUsuario")
	private Long id;
	
	@Column(name = "NomeCompleto")
	private String nomeCompleto;
	
	@Column(name =  "NomeUsuario")
	private String nomeUsuario;
	
	@Column(name = "Senha")
	private String senha;
	
	@Column(name = "CodPessoa")
	private Long codPessoa;
	
	@Column(name = "Setor")
	private String setor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Long getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(Long codPessoa) {
		this.codPessoa = codPessoa;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}


	
	
}
