package com.laborsil.start.repositoryController;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.laborsil.start.model.ModelProduto;

@Repository
public interface RepositoryProduto extends JpaRepository<ModelProduto,Long> {

	
	ModelProduto findById(long Id);
	ModelProduto deleteById(long Id);
	
	@Query("FROM ModelProduto WHERE nomeProduto = ?1")
	List<ModelProduto> findByNomeProduto(String nomeProduto);
	
	@Query("FROM ModelProduto WHERE CodArmazem = ?1")
	List<ModelProduto> findByCodArmazem(String codArmazem);

}
