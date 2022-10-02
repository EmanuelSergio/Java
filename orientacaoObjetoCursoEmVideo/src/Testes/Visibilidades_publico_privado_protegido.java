package Testes;

public class Visibilidades_publico_privado_protegido {

	public String cor;
	public String modelo;
	private float ponta;
	protected int carga;
	protected boolean tampa = true;
	
	public void rabiscar() {
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
	
	public void status() {
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
