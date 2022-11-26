package oo.heranca.desafio;

public class Corrida {

	public static void main(String[] args) {
		
		Carro c1 = new Ferrari();
		Carro c2 = new Civic();
		
		
		
		c1.acelerar();
		c2.acelerar();
		
		System.out.println(c1);
		System.out.println(c2);
		
		
		
		
	}
	
	
}
