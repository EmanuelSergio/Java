package Generics;

public class Exercicio1 {public static void main(String[] args) {
	
	
	
	Par <String, Double> a1 = new Par("Joao", 456.0);
	Par <Integer, String> a2 = new Par(23132, "Carlos");
	Par <Float, Float> a3 = new Par(4.5f, 7.6f);
	
	System.out.println(a1 +"\n"
			+ "" +a2 +"\n"
					+ "" +a3);
	
}
}
