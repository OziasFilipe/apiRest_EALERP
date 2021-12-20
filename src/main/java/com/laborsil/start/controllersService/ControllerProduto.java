package com.laborsil.start.controllersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import javax.websocket.server.PathParam;
import com.laborsil.start.model.ModelProduto;
import com.laborsil.start.repositoryController.RepositoryProduto;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("produto")
public class ControllerProduto {

	@Autowired
	private RepositoryProduto repositoryProduto;
	
	
	/**********                **********/
	/**********  Requisição GET **********/
	/**********                **********/
	
	@GetMapping("tipo")
	public ModelProduto Tipo(ModelProduto modeloProduto) {
		return modeloProduto;
	}
	
	@GetMapping("buscarProdutos")
	public  List<ModelProduto> BuscarTodosProdutos(){
		return repositoryProduto.findAll();
	}
	
	@GetMapping("{id}")
	public ModelProduto BuscarProdutoId(@PathVariable(value="id")long id) {
		return repositoryProduto.findById(id);
	}
	
	@GetMapping("codArmazem")
	public List<ModelProduto> BuscarCodArmazem(@PathParam(value ="nome")String nome) {
		return repositoryProduto.findByCodArmazem(nome);
	}
	
	
	/**********                **********/
	/**********  Requisição POST **********/
	/**********                **********/
	 
	@PostMapping("save")
	public ModelProduto InserirProduto(@RequestBody ModelProduto produto) {
		return repositoryProduto.save(produto);
	}
	
	/**********                **********/
	/**********  Requisição PUT **********/
	/**********                **********/
	
	@PostMapping("atualizar")
	public ModelProduto atualizarProduto(@RequestBody ModelProduto produto) {
		return repositoryProduto.save(produto);
	}
	
	/**********                **********/
	/**********  Requisição DELETE **********/
	/**********                **********/
	
	@DeleteMapping("{id}")
	public ModelProduto deletarUsuario(@PathVariable(value = "id")long id) {
		return repositoryProduto.deleteById(id);
	}
	
}
