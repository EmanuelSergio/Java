package teste.basico;

import java.util.List;

import infra.DAO;
import modelo.basico.Produto;

public class ObterProdutosEmanuel {

	public static void main(String[] args) {
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		
		
		List<Produto> produtos = dao.obterTodos();
		
		dao.abrirTransacao();
		
		for (Produto produto : produtos) {
			System.out.println(produto.getNome());
		}
		
	}
	 
	
	
}
