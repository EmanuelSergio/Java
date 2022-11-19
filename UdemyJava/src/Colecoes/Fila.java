package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//caso colocarmos um tamanho maximo na fila
		//o "fila.add()" pode retornar um erro se o tamanho da fila for excedido
		//no caso do "fila.offer()" vai retornar um true ou false 
		
		
		
		
		fila.add("ana");
		fila.offer("Bia"); 
		fila.add("Carlos"); 
		fila.offer("Daniel"); 
		fila.add("Rafaela"); 
		fila.offer("Gui"); 
		
		//o element vai causar um erro de a fila estiver vazia na execução
		//o peek so vai retornar null
		
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element().toUpperCase());
		
		
		
		
		
	}

}
