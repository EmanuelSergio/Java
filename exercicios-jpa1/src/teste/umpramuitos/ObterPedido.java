package teste.umpramuitos;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class ObterPedido {

	public static void main(String[] args) {
		
		DAO<Pedido> dao = new DAO<>(Pedido.class);
		
		Pedido pedido = dao.obterPorId(1L);
		dao.fechar();

		
		
		for (ItemPedido item: pedido.getItens()) {
			System.out.println(item.getQuantidade());
		}
		
		
	}
	
}
