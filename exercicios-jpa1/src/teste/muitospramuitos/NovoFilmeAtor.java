package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {
 
	public static void main(String[] args) {
		
		Filme filmeA = new Filme("Carros 1", 10.0);
		Filme filmeB = new Filme("Carros 2", 8.5);
		
		Ator atorA = new Ator("Mcquen");
		Ator atrizB = new Ator("Celli");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizB);
		
		filmeB.adicionarAtor(atorA);
		
		DAO<Filme> dao = new DAO<Filme>();
		dao.incluirAtomico(filmeA);
		
		
		
	}
	
}
