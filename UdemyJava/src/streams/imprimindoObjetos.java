package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class imprimindoObjetos {

	public static void main(String[] args) {
		
		List<String>aprovadosList=Arrays.asList("Lu","Gui","Luca","Ana");
		
		System.out.println("Usando o foreach:");
			for (String string : aprovadosList) {
				System.out.println(string);
			}
		
		System.out.println("\nUsando Iterator");
		
		Iterator<String>it = aprovadosList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nUsando Stream ");
		Stream <String> stream = aprovadosList.stream(); 
		
		stream.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
	}
}
