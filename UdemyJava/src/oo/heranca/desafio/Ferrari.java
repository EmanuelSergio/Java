package oo.heranca.desafio;

public class Ferrari extends Carro{

	/*void acelerar(Carro carro) {
		double c1 = super.acelerar(carro);
		double c2 =super.acelerar(carro);
		
		return c1 + c2;
	}*/
	
	

	Ferrari(){
		this(315);
	}
	
	Ferrari(int velocidadeMaximaFerrari){
		super(velocidadeMaximaFerrari);
		delta = 350;
	}
	
	
	
	/*void acelerar() {

		super.acelerar();
	}
	*/
	
	
	
}
