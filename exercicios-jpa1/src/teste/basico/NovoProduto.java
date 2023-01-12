package teste.basico;


import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		DAO<Produto> dao = new DAO<Produto>(Produto.class);
		Produto produto = new Produto("caneta azul ", 9.98);
		
		dao.incluirAtomico(produto);
		
		
		
		
		
		System.out.println("id do produto => " +produto.getId());
		
		
		
		
	}
	
}
