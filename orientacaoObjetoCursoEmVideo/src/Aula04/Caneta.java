package Aula04;

public class Caneta {

	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	 
	public void escrever() {
		
		
	}
	
	
	
	public String getModelo() {
		return this.modelo;
		
	
	}
	
	void status() {
		System.out.println("Modelo: "+modelo);
		System.out.println("Cor: "+cor);
		System.out.println("Carga %"+carga);
		System.out.println("Ponta: "+ponta +"mm");
		if(tampada == true)
			System.out.println("Tampada");
		if(tampada == false)
			System.out.println("Destampada");
		else
			System.out.println("");
		
	}
	
	public void tampar() {
		this.tampada=true;
	
		
	}
	
	public void destampada() {
		this.tampada=false;
	}
	
	
	
	
}
