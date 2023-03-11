package br.com.estudosSpring.exerciciossb.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@PostMapping
	public @ResponseBody Produto novoProduto(@Valid Produto produto) { //vai exigir as regras (anotacoes) demarcadas na classe produto
		produtoRepository.save(produto);
		return produto;
	}
 
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
		
	}
	  
	@GetMapping(path = "/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
		
	}
	
	
	
}
