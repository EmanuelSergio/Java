package Colecoes;

//import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		
		//Set<String> lista = new HashSet<String>();  
		
		//OU:
		
		//Set<String> lista = new HashSet<>(); //quando eu coloco <String>, estou definindo que meu list aceitara apenas String
		SortedSet<String> lista = new TreeSet<>(); // vai deixar a lista organizada
		
		lista.add("Emanuel");
		lista.add("Lucas");
		lista.add("Jão");
		lista.add("Wendel");
		lista.add("Maria");
		lista.add("Ana");
		
		
		for (String canditado : lista) {
			System.out.println(canditado);
			
		}
		
		Set<Integer> numeros = new HashSet<>();
		
		numeros.add(5);
		numeros.add(5);
		numeros.add(5);
		numeros.add(9);
		numeros.add(10);
		
		//numeros.get(5); não é possivel acessar pelo indice
		
		System.out.println(numeros);
		
		int zero = 0;
		
		for (Integer integer : numeros) {
			if (integer > zero) {
				zero=integer;
				System.out.println("eu sou o maior: " +zero);
			}
			//System.out.println(integer);
		}
		
		
		
	}
	
}
