package br.com.estudosSpring.exerciciossb.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudosSpring.exerciciossb.model.entities.Produto;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@PostMapping
	public @ResponseBody Produto novoProduto(@RequestParam String nome) {
		Produto produto = new Produto(nome);

		return produto;
	}

	
	
	
	
	
}
