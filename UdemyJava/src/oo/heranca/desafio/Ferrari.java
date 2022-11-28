package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo{

	/*void acelerar(Carro carro) {
		double c1 = super.acelerar(carro);
		double c2 =super.acelerar(carro);
		
		return c1 + c2;
	}*/
	
	

	public Ferrari(){
		this(315);
	}
	
	public Ferrari(int velocidadeMaximaFerrari){
		super(velocidadeMaximaFerrari);
		delta = 15;
	}
	
	@Override
	public void ligarTurbo() {
		delta=35;
	}
	
	@Override
	public void desligarTurbo() {
		delta=15;
	}

	
	/*void acelerar() {

		super.acelerar();
	}
	*/
	
	
	
}
