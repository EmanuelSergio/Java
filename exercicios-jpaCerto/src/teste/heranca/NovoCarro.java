package teste.heranca;

import infra.DAO;
import modelo.heranca.Carro;
import modelo.heranca.Mercedes;

public class NovoCarro {

	public static void main(String[] args) {
		
		DAO<Carro> carroDAO = new DAO<Carro>();
		
		Carro fiat = new Carro("TORO", "prata");
		Mercedes carroTop = new Mercedes("SUV", "azul", "v12", true);
		
		carroDAO.incluirAtomico(fiat);
		carroDAO.incluirAtomico(carroTop);
		
		carroDAO.fechar();
		
	}
	
}
