package Generics;

public class CaisaObjetoTeste {

	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		
		caixaA.guardar(2.3); //double -> vai converter para uma classe tipo Double
		
		Double coisaA = (Double)caixaA.abrir();
		
		System.out.println(coisaA);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		
		caixaB.guardar("OLA"); //double -> vai converter para uma classe tipo Double
		
		String coisaB = (String)caixaB.abrir();
		
		System.out.println(coisaB);
		
		
		
	}
	
}
