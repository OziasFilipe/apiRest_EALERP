package com.laborsil.start.repositoryController;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.laborsil.start.model.ModelPessoa;

@Repository
public interface RepositoryPessoa extends JpaRepository<ModelPessoa,Long> {
	
	ModelPessoa findById(long Id);
	ModelPessoa deleteById(long Id);
	
	@Query("FROM ModelPessoa WHERE nomeCompleto = ?1")
	List<ModelPessoa> findByNomeCompleto(String nomeCompleto);
	
	@Query("FROM ModelPessoa WHERE cpf = ?1")
	List<ModelPessoa> findByCpf(String cpf);
}
