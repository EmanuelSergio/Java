package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		//está convertendo do tipo primitivo para  classes
		
		
		// 
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); //boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add("teste");
		conjunto.add(1); //int -> Integer
		conjunto.add('x'); //char -> caracter
		
		System.out.println("Tamanho: " +conjunto.size());
		
		System.out.println(conjunto.remove('s'));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.size());
		System.out.println(conjunto.contains(1.2));
		System.out.println(conjunto.contains(2));
		
		
		System.out.println(" \nNums: \n");
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums); //uniao entre dois conjuntos
		conjunto.retainAll(nums); //vai mostrar apenas o conjunto que está no outro objeto
		
		
		conjunto.clear();
		
		System.out.println(conjunto);
		
		
		
	}
	
	
	
}
