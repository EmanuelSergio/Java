package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {
		
		DAO<Cliente> daoCliente = new DAO<Cliente>(Cliente.class);
		
		Cliente cliente = daoCliente.obterPorId(4L);
		System.out.println(cliente.getAssento().getNome());
		daoCliente.fechar();
	
		DAO<Assento> daoAssento = new DAO<Assento>(Assento.class);
		Assento assento = daoAssento.obterPorId(1L);
		
		System.out.println(assento.getCliente().getNome());
		
		daoAssento.fechar();
		
		
		
	}
}
