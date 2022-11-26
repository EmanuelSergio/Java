package oo.heranca.desafio;

public class Ferrari extends Carro{

	double acelerar(Carro carro) {
		double c1 = super.acelerar(carro);
		double c2 =super.acelerar(carro);
		
		return c1 + c2;
	}
	
	
	
	
}
