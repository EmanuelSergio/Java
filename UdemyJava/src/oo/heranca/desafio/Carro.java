package oo.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	protected double velocidadeAtual=0;
	protected int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar(Carro carro) {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			carro.velocidadeAtual+=5;
		}
		
	}
	
	public void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual+=5;
		}
		
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
		return "A VELOCIDADE ATUAL �: " + velocidadeAtual + "KM/H";
	}
	
	
	
	
}
