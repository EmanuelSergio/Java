package Testes;

public class Caneta {

	String cor;
	String modelo;
	int carga;
	float ponta;
	boolean tampa = true;
	
	void rabiscar() {
		if(tampa == true) {
			System.out.println("Destampe a caneta para rabiscar");
		}else
			System.out.println("Rabiscado");
	}
	
	void tampar() {														
		this.tampa=true;
		
	}
	
	void destampar(){
		this.tampa=false;
		
	}
	
	void status() {
		System.out.println("Modelo: "+modelo);
		System.out.println("Cor: "+cor);
		System.out.println("Carga %"+carga);
		System.out.println("Ponta: "+ponta +"mm");
		if(tampa == true)
			System.out.println("Tampada");
		else
			System.out.println("Destampada");
		
		
	}
	
	
	
	
}
