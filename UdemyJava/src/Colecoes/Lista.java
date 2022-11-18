package Colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario a1 = new Usuario("Emanuel");
		
		lista.add(a1);		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Manu"));
		
		for (Usuario u : lista) {
			System.out.println(u.nome);
		}
		
		
	}
	
	
	
}
