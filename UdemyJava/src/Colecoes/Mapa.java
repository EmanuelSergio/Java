package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Emanuel");
		usuarios.put(4, "Rebeca");
		
		//System.out.println(usuarios.remove(1));aqui se remove pela chave
		System.out.println(usuarios.remove(3, "Emanuel"));
		System.out.println(usuarios.remove(2, "Emanuel")); //vai retornar false pois a chave não combina com o valor
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet()); //mostra as chaves do usurio, no caso o integer
		
		System.out.println(usuarios.values());//mostra apenas os valores (String)
		System.out.println(usuarios.entrySet());//mostra os valores junto com o codigo (Integer)
		
		System.out.println(usuarios.containsKey(3));//esse nao possui mais o contains por String (se indica o codigo para saber de contem)
		System.out.println(usuarios.containsValue("Emanuel"));//esse retorna apenas o conteudo (String)
		
		System.out.println(usuarios.get(2)); //aqui ele informa o elemento e me retorna o item (String)
		
		System.out.println();
		
		for (int chave : usuarios.keySet()) {
			
			System.out.println(chave);
			
		}
		
		for (String string : usuarios.values()) {
			System.out.println(string);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() +" ==> ");
			System.out.println(registro.getValue());
			System.out.println("\nOu: " +registro +"\n");
		}
		
		
		
	}
	
}
