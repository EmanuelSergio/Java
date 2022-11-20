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
		
		System.out.println(fila.peek());//retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element().toUpperCase()+"\n");//lança uma exceção
		
		//para exclusao de elementos da fila
		
		//fila.size() -> mostra a quantidade de itens
		//fila.clear() -> deleta a fila inteira
		//fila.isEmpty() -> diz se está vazia, se estiver retorna true
		//fila.poll() -> quando chamado ele apaga o elemento e mostra no console, se já não ouver nada pra apagar, retorna null
		
		System.out.println(fila.isEmpty());
		
		System.out.println(fila.size());
		
		System.out.println("A fila contem ana? "+fila.contains("ana"));
		
		
		
		System.out.println(fila.poll()); //retorna null se estiver vazio
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());//retorna uma exceção se estiver vazio
		
		
	}

}
