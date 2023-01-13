package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {

	public static void main(String[] args) {
		
		Assento assento = new Assento("49D");
		Cliente cliente = new Cliente("aria", assento);
		
		 
		
		DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);
		
		dao.incluirAtomico(cliente);
		
		
		
		
		
	}
	
}
