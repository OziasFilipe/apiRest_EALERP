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
import com.laborsil.start.model.ModelPessoa;
import com.laborsil.start.repositoryController.RepositoryPessoa;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("pessoa")
public class ControllerPessoa {

	@Autowired
	RepositoryPessoa repositoryPessoa;
	
	/**********                **********/
	/**********  Requisição GET **********/
	/**********                **********/
	
	@GetMapping("tipo")
	public ModelPessoa tipoPessoa(ModelPessoa pessoa) {
		return pessoa;
	}
	
	@GetMapping("buscarAll")
	public List<ModelPessoa> BuscarTodasPessoas() {
		return repositoryPessoa.findAll();
	}
	
	@GetMapping("nome")
	public List<ModelPessoa> BuscarPessoaNomeCompleto(@PathParam(value ="nome")String nome) {
		return repositoryPessoa.findByNomeCompleto(nome);
	}
	
	@GetMapping("{id}")
	public ModelPessoa BuscarPessoaId(@PathVariable(value="id")long id) {
		return repositoryPessoa.findById(id);
	}
	
	/**********                **********/
	/**********  Requisição POST **********/
	/**********                **********/
	
	@PostMapping("save")
	public ModelPessoa InserirPessoa(@RequestBody ModelPessoa pessoa) {
		return repositoryPessoa.save(pessoa);
	}
	
	/**********                **********/
	/**********  Requisição PUT **********/
	/**********                **********/
	
	@PutMapping("atualizar")
	public ModelPessoa atualizarPessoa(@RequestBody ModelPessoa usuario) {
		return repositoryPessoa.save(usuario);
	}
	
	/**********                **********/
	/**********  Requisição DELETE **********/
	/**********                **********/
	
	@DeleteMapping("{id}")
	public ModelPessoa deletarPessoa(@PathVariable(value = "id")long id) {
		return repositoryPessoa.deleteById(id);
	}
}
