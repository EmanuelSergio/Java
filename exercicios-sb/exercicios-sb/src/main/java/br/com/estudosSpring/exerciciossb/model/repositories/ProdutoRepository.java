package br.com.estudosSpring.exerciciossb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.estudosSpring.exerciciossb.model.entities.Produto;

public interface ProdutoRepository 
extends CrudRepository<Produto, Integer>, 
PagingAndSortingRepository<Produto, Integer>{ //pagingAnd... traz metodos que fazem a paginação no json

	
	//o spring cria metodos sozinhos que tenham nomes ja pre definidos
	//nesse caso foi o Containing
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
	
	//Exemplos:
	//findByNomeContains
	//findByNomeStartsWith
	//findByNomeEndsWith
	//findByNomeNotContaining
	
//	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
//	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
//	
}
