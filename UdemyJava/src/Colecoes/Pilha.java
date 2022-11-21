package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequene Prícipe");
		livros.push("Dom quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.size());//informa o tamanho da pilha
		
		//livros.clear(); --> limpa todos os elemtos da lista

		System.out.println("A fila contem O hobbit? " +livros.contains("O Hobbit"));
		
		System.out.println("A fila esta vazia? " +livros.isEmpty());
		
		System.out.println("\n foreach \n");
		
		for (String string : livros) {
			System.out.println("--"+string+"--");
			
		}
		
		for(String livro: livros) {
			System.out.println("=="+livros+"==");
		}
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());//retorna null caso não ache elementos
		System.out.println(livros.pop());//retorna exceção caso não ache
		
		
		
		
	}
	
}
