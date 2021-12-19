package com.laborsil.start.repositoryController;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.laborsil.start.model.ModelArmazem;

@Repository
public interface RepositoryArmazem extends JpaRepository<ModelArmazem,Long>{

	ModelArmazem findById(long Id);
	ModelArmazem deleteById(long Id);
	
	@Query("FROM ModelArmazem WHERE nomeArmazem = ?1")
	List<ModelArmazem> findByNomeArmazem(String nomeArmazem);
	
	
}
