package com.laborsil.start.repositoryController;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.laborsil.start.model.ModelUsuario;


@Repository
public interface RepositoryUsuario extends JpaRepository<ModelUsuario,Long> {

	ModelUsuario findById(long Id);
	ModelUsuario deleteById(long Id);
	
	@Query("FROM ModelUsuario WHERE nomeUsuario = ?1")
	List<ModelUsuario> findByNomeUsuario(String nomeUsuario);
	
	@Query("FROM ModelUsuario WHERE senha = ?1")
	List<ModelUsuario> findBySenha(String Senha);
	
}
