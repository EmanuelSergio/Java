package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("Ferrari", "luxo", 10000);
		Carro c2 = new Carro("Polo", "padrao", 7000);
		Carro c3 = new Carro("Uno", "padrao", 3000);
		Carro c4 = new Carro("Mclaren", "luxo", 15000);
		Carro c5 = new Carro("Porshe", "luxo", 9000);
		Carro c6 = new Carro("Cadilac", "luxo", 8000);
		
		
		List<Carro> carro = Arrays.asList(c1,c2,c3,c4,c5,c6);
		
		Consumer<String> print = System.out::println;
		
		Predicate<Carro> categoriaTop = c -> c.categoria.equalsIgnoreCase("luxo");
		Predicate<Carro> valorMinimo = c -> c.preco>=10000;
		
		Function<Carro, String> indice = c-> "\nNome:"+c.nome+"\nValor $"+c.preco+
				"\nCategoria: " +c.categoria.toUpperCase();
		
		
		
		carro.stream()
		.filter(categoriaTop)
		.filter(valorMinimo)
		.map(indice)
		.forEach(print);
		
		System.out.println("===================================");
		
		carro.stream().map(indice).forEach(print);
		
		
		
	}
	
}
