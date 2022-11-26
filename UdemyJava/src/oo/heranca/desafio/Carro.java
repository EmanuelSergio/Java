package oo.heranca.desafio;

public class Carro {

	double velocidadeAtual=0;
	
	
	
	void acelerar(Carro carro) {
		 carro.velocidadeAtual+=5;
		
	}
	
	void acelerar() {
		 velocidadeAtual+=5;
		
	}
	
	double frear(Carro carro) {
		
		if(carro.velocidadeAtual>=5) {
			return carro.velocidadeAtual-=5;
		}else {
			return 0;
		}
		
	}

	double frear() {
		
		if(velocidadeAtual>=5) {
			return velocidadeAtual-=5;
		}else {
			return 0;
		}
		
	}
	
	
	@Override
	public String toString() {
		return "A VELOCIDADE ATUAL É: " + velocidadeAtual + "KM/H";
	}
	
	
	
	
}
