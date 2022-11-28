package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

	/*void acelerar(Carro carro) {
		double c1 = super.acelerar(carro);
		double c2 =super.acelerar(carro);
		
		return c1 + c2;
	}*/
	private boolean ligarTurbo=false;
	private boolean ligarAr=false;

	public Ferrari(){
		this(315);
	}
	
	public Ferrari(int velocidadeMaximaFerrari){
		super(velocidadeMaximaFerrari);
		setDelta(15);
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
	
	@Override
	public int getDelta() {
		if(ligarTurbo&& !ligarAr) {
			return 35;
		}else if(ligarAr && ligarTurbo) {
			return 30;
		}else if(!ligarAr && !ligarTurbo) {
			return 20;
		}else {
			return 15;
		}
	}
	
	
	
	/*void acelerar() {

		super.acelerar();
	}
	*/
	
	
	
}
