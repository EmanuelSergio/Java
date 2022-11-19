package Colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		List<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario a1 = new Usuario("Emanuel");
		
		lista.add(a1);		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(1));
		System.out.println("aqui: " +lista.get(3)); //acessar pelo indice
		
		
		
		System.out.println("\nremovido pelo indice: "+lista.remove(1));
		System.out.println("Removido pelo nome " +lista.remove(new Usuario("Carlos"))+"\n");
		
		System.out.println("Tem? " +lista.contains(new Usuario("Lia")));
		System.out.println("tem? " +lista.contains(a1)+"\n");
		
		
		for (Usuario u : lista) {
			System.out.println(u.toString());
		}
		
		ArrayList<String> l = new ArrayList<String>();
		
		
		
		System.out.println("Fale um nome");
		l.add(leia.next());
		
		System.out.println(l);
		
	}
	 
	
	
}
