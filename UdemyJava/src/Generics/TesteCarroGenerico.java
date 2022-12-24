package Generics;

public class TesteCarroGenerico {

	public static void main(String[] args) {
		
		CarroGenerico<String> c1  = new CarroGenerico<String>("1.000", "ford", "carrao ");
		
		System.out.println(c1.toString());
		
		
		
	}
	
}
