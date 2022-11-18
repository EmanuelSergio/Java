package Colecoes;

import java.util.Collections;
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
		lista.add("J�o");
		lista.add("Wendel");
		lista.add("Maria");
		lista.add("Ana");
		
		
		for (String canditado : lista) {
			System.out.println(canditado);
			
		}
		
		Set<Integer> numeros = new HashSet<>();
		
		numeros.add(5);
		numeros.add(88);
		numeros.add(4);
		numeros.add(9);
		numeros.add(10);
		
		int maior = 0;
		
		for (Integer integer : numeros) {
			if (integer > maior) {
				integer=maior;
				System.out.println("eu sou o maior: " +maior);
			}
			System.out.println(integer);
		}
		
		
		
	}
	
}
