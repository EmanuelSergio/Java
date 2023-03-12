package br.com.estudosSpring.exerciciossb.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudosSpring.exerciciossb.model.entities.Produto;
import br.com.estudosSpring.exerciciossb.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

		
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	//@PostMapping
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT}) //dois metodos em um 
	public @ResponseBody Produto novoProduto(@Valid Produto produto) { //vai exigir as regras (anotacoes) demarcadas na classe produto
		produtoRepository.save(produto);
		return produto;
	}
 
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
		
	}
	 
	@GetMapping(path = "/pagina/{numeroPagina}")
	public Iterable<Produto> obterProdutosPorPagina(
			@PathVariable int numeroPagina){
		Pageable page = PageRequest.of(numeroPagina, 3);
		return produtoRepository.findAll(page);
		
	}
	 
	
	
	@GetMapping(path = "/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
		
	}
	
	
	
	//metodo que altera item do banco
//	@PutMapping
//	public Produto alterarProduto(@Valid Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//		
//	}
	
	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
		
	}

	
	
	
}
