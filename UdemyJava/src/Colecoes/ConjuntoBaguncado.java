package Colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		//está convertendo do tipo primitivo para  classes
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); //boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); //int -> Integer
		conjunto.add('x'); //char -> caracter
		
		System.out.println("Tamanho: " +conjunto.size());
		
		
		
		
		
		
	}
	
	
	
}
