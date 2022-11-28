package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

	/*void acelerar(Carro carro) {
		double c1 = super.acelerar(carro);
		double c2 =super.acelerar(carro);
		
		return c1 + c2;
	}*/
	private boolean ligarTurbo;
	private boolean ligarAr;

	public Ferrari(){
		this(315);
	}
	
	public Ferrari(int velocidadeMaximaFerrari){
		super(velocidadeMaximaFerrari);
		if(ligarTurbo==true) {
			setDelta(35);
		}else {
			setDelta(15);
		}
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo=true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo=false;
	}

	@Override
	public void ligarAr() {
		ligarAr=true;
	}

	@Override
	public void desligarAr() {
		ligarAr=false;
	}
	
	/*void acelerar() {

		super.acelerar();
	}
	*/
	
	
	
}
