package Generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		
		//CaixaNumero<String> c1 = new CaixaNumero<String>();
		//c1.guardar("dasdda");
		
		CaixaNumero<Double> c2 = new CaixaNumero<Double>();
		
		c2.guardar(2.2);
		System.out.println(c2.abrir());
		
		
		
	}
	
}
