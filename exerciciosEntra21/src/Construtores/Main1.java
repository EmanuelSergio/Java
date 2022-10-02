package Construtores;


public class Main1 {

	public static void main(String[] args) {
		
		Questao1 lampada = new Questao1("Philips", "Interno", "ligado", "amarela", 500, 15, true);
		
		
		lampada.lampada();//para deixar desligada
		lampada.lampadades();//para deixar ligada
		
		lampada.status();
		
		
		
	}
	
	
}
