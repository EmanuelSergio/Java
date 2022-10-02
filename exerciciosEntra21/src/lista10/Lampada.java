package lista10;

public class Lampada {

	String marca;
	String ambiente;
	String status;
	String cor;
	int potencia;
	int voltagem;	
	boolean lampada = true;
	
	void lampada() {
		
		if(lampada == true){
		lampada = false;
		status="ligada";
		}else if(lampada == false){
		lampada = true;
		status="desligada";
	}
	}
	
	void status () {
		
		System.out.println(status);
		
	}
	
	
	
	
	
	
	
	
	
}
