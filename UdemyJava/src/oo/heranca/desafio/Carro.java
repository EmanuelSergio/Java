package oo.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	protected double velocidadeAtual=0;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	
	
	public int getDelta() {
		return delta;
	}



	public void setDelta(int delta) {
		this.delta = delta;
	}



	public void acelerar(Carro carro) {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			carro.velocidadeAtual+=5;
		}
		
	}
	
	public void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual+=getDelta();
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
		return "A VELOCIDADE ATUAL É: " + velocidadeAtual + "KM/H";
	}
	
	
	
	
}
