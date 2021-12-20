package com.laborsil.start.controllersService;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laborsil.start.model.ModelUsuario;
import com.laborsil.start.repositoryController.RepositoryUsuario;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("usuario")
public class ContollerUsuario {

	@Autowired
	private RepositoryUsuario repositoryUsuario;
	
	
	/**********                **********/
	/**********  Requisição GET **********/
	/**********                **********/
	 
	@GetMapping("tipo")
	public ModelUsuario tipoUsuario(ModelUsuario usuario) {
		return usuario;
	}
	
	@GetMapping("buscarAll")
	public List<ModelUsuario> BuscarUsuario() {
		return repositoryUsuario.findAll();
	}
	
	@GetMapping("{id}")
	public ModelUsuario BuscarUsuarioId(@PathVariable(value="id")long id) {
		return repositoryUsuario.findById(id);
	}
	
	@GetMapping("nome")
	public List<ModelUsuario> BuscarUsuarioNome(@PathParam(value ="nome")String nome) {
		return repositoryUsuario.findByNomeUsuario(nome);
	}
	
	@GetMapping("senha")
	public List<ModelUsuario> BuscarUsuarioSenha(@PathParam(value = "senha")String senha){
		return repositoryUsuario.findBySenha(senha);
	}
	
	
	/**********                **********/
	/**********  Requisição POST **********/
	/**********                **********/
	 
	
	@PostMapping("save")
	public ModelUsuario InserirUsuario(@RequestBody ModelUsuario usuario) {
		return repositoryUsuario.save(usuario);
	}
	
	/**********                **********/
	/**********  Requisição PUT **********/
	/**********                **********/
	
	@PostMapping("atualizar")
	public ModelUsuario atualizarUsuario(@RequestBody ModelUsuario usuario) {
		return repositoryUsuario.save(usuario);
	}
	
	/**********                **********/
	/**********  Requisição DELETE **********/
	/**********                **********/
	
	@DeleteMapping("{id}")
	public ModelUsuario deletarUsuario(@PathVariable(value = "id")long id) {
		return repositoryUsuario.deleteById(id);
	}
}
