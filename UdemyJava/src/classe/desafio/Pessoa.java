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



	 void comerprof(Comida comida) {
		
		 if(comida != null) {
			  this.peso += comida.peso;			 
		 }
		 
		
	}
	
	 double comer(double peso) {
			
		 
			return this.peso + peso;
			
	 }
	
	 String apresentar() {
		 return "Nome: " +nome +"KG: " +peso;
	 }
	
	
	
}
