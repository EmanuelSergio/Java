package br.com.estudosSpring.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.estudosSpring.exerciciossb.model.entities.Produto;

public interface ProdutoRepository 
extends CrudRepository<Produto, Integer>{

	
	
	
}
