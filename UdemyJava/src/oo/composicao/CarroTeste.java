package oo.composicao;

public class CarroTeste {
public static void main(String[] args) {
	
	
		Carro c = new Carro();
		System.out.println(c.estaLigado());
	
	
	
		c.ligar();
		System.out.println(c.estaLigado());
	
		System.out.println(c.motor.giros());
	
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		
		
		
		System.out.println(c.motor.giros());
		
		//c.desligar();
		
		c.acelerar();
		
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		
		//faltou encapsulamento
		//c1.motor.fatorInjecao = -30
		
		//relação bidirencional
		System.out.println(c.motor.carro.motor.carro.motor.giros());
		
		
		System.out.println(c.motor.giros());
		
}
}
