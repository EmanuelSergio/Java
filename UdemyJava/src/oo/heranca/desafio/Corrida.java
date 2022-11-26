package oo.heranca.desafio;

public class Corrida {

	public static void main(String[] args) {
		
		Carro c1 = new Ferrari();
		Carro c2 = new Civic();
		
		System.out.println(c1.acelerar(c1));
		System.out.println(c2.acelerar(c2));
		
		c1.frear(c1);
		c1.frear(c1);
		c1.frear(c1);
		
		System.out.println(c1.velocidadeAtual);
		
		
		
		
		
	}
	
	
}
