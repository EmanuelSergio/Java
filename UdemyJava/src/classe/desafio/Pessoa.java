package classe.desafio;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(){
		
	}
	
	public Pessoa(String nome, double peso) {
		
		this.nome = nome;
		this.peso = peso;
	}



	 double comer(double peso) {
		
		 
		return this.peso + peso;
		
		
		
	}
	
	
	
	
	
}
