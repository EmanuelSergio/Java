package oo.heranca.desafio;

public class Carro {

	double velocidadeAtual;
	
	
	
	double acelerar(Carro carro) {
		return carro.velocidadeAtual+=5;
		
	}
	
	double frear(Carro carro) {
		
		if(carro.velocidadeAtual>0) {
			return carro.velocidadeAtual-=5;
		}else {
			return 0;
		}
		
	}
	
	
	
	
}
