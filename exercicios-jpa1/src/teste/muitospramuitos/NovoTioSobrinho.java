package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio tia1 = new Tio("Maria");
		Tio tio2 = new Tio("Joao");
		
		Sobrinho sobrinho1 = new Sobrinho("Davi");
		Sobrinho sobrinho2 = new Sobrinho("Ana");
		
		tia1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tia1);
		
		tia1.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tia1);
		
		tio2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio2);
		
		tio2.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio2);
		
		DAO<Object> dao = new DAO<Object>();
		
		dao.abrirTransacao()
		.incluir(tia1)
		.incluir(tio2)
		.incluir(sobrinho1)
		.incluir(sobrinho2)
		.fecharTransacao()
		.fechar();
		 
		
		
		
	}
	
}
