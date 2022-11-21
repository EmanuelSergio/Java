package oo.composicao;

public class Carro {

	Motor  motor = new 	Motor();

	
	
	void acelerar() {
		if(estaLigado()==true && motor.fatorInjecao<2.6) {
			motor.fatorInjecao += 0.4;			
		}else {
			motor.fatorInjecao+=0;
		}
		
	}
	
	void frear() {
		if(motor.fatorInjecao>0.5) {
			motor.fatorInjecao-= 0.4;
			
		}
	}
	
	void ligar() {
		motor.ligado=true;
	}
	
	void desligar() {
		motor.ligado=false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
	
	
	
	
	
	
	
	
}
