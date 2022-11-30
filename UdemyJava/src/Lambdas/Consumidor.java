package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome +"!!!");
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		Produto p2 = new Produto("Celular", 3000, 0.03);
		Produto p3 = new Produto("TV", 5000, 0.18);
		Produto p4 = new Produto("Caderno", 19.90, 0.19);
		
		imprimirNome.accept(p1);//recebe um unico paramentro e não retorna nada
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
		
		Consumer<Produto> soma = p -> System.out.println(p.preco+p.preco);
		
		
		List<Produto> so = Arrays.asList(p1,p2,p3);
		
		so.forEach(soma);
		
		
		
		
		
		
	}
	
	
}
