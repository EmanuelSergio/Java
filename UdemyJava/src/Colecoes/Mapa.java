package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Emanuel");
		usuarios.put(4, "Rebeca");
		
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet()); //mostra as chaves do usurio, no caso o integer
		
		System.out.println(usuarios.values());//mostra apenas os valores (String)
		System.out.println(usuarios.entrySet());//mostra os valores junto com o codigo (Integer)
		
		
		
		
		
		
		
	}
	
}
