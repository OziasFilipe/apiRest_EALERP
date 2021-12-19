package com.laborsil.start.controllersService;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laborsil.start.model.ModelArmazem;
import com.laborsil.start.model.ModelUsuario;
import com.laborsil.start.repositoryController.RepositoryArmazem;

@RestController
@RequestMapping("armazem")
public class ControllerArmazem {

	@Autowired
	RepositoryArmazem repositoryArmazem;
	/**********                **********/
	/**********  Requisição GET **********/
	/**********                **********/
	
	@GetMapping("tipo")
	public ModelArmazem tipoArmazem(ModelArmazem armazem) {
		return armazem;
	}
	
	@GetMapping("buscarAll")
	public List<ModelArmazem> BuscarTodosArmazem() {
		return repositoryArmazem.findAll();
	}
	
	@GetMapping("{id}")
	public ModelArmazem BuscarArmazemId(@PathVariable(value="id")long id) {
		return repositoryArmazem.findById(id);
	}
	
	@GetMapping("nomeArmazem")
	public List<ModelArmazem> BuscarnomeArmazem(@PathParam(value ="nomeArmazem")String nomeArmazem) {
		return repositoryArmazem.findByNomeArmazem(nomeArmazem);
	}
	
	/**********                **********/
	/**********  Requisição POST **********/
	/**********                **********/
	 
	
	@PostMapping("save")
	public ModelArmazem InserirArmazem(@RequestBody ModelArmazem armazem) {
		return repositoryArmazem.save(armazem);
	}
	
	/**********                **********/
	/**********  Requisição PUT **********/
	/**********                **********/
	
	@PutMapping("atualizar")
	public ModelArmazem AtualizarArmazem(@RequestBody ModelArmazem armazem) {
		return repositoryArmazem.save(armazem);
	}
	
	/**********                **********/
	/**********  Requisição DELETE **********/
	/**********                **********/
	
	@DeleteMapping("{id}")
	public ModelArmazem DeletarArmazem(@PathVariable(value = "id")long id) {
		return repositoryArmazem.deleteById(id);
	
}
}
