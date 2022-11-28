package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Corrida {

	public static void main(String[] args) {
		
		Ferrari c1 = new Ferrari(400);
		Carro c2 = new Civic();
		
		
		c1.acelerar();
		c2.acelerar();
		c1.acelerar();
		c2.acelerar();
		c1.acelerar();
		c2.acelerar();
		
		c1.ligarTurbo();
		
		System.out.println(c1);
		System.out.println(c2);
		
		
		
	}
	
	
}
