package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Corrida {

	public static void main(String[] args) {
		
		Ferrari c1 = new Ferrari(400);
		Carro c2 = new Civic();
		
		c1.ligarAr();
		c1.ligarTurbo();
		
		c1.acelerar();
		c2.acelerar();
		c1.acelerar();
		c2.acelerar();
		c1.acelerar();
		c2.acelerar();
		
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.velocidadeDoAr());
		
	}
	
	
}
