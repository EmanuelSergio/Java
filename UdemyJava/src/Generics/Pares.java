package Generics;

import java.util.SortedSet;
import java.util.TreeSet;

public class Pares<C extends Number, V> {

	private final  SortedSet<Par<C, V>> itens = new TreeSet<>();
	
	public void adicionar(C chave , V valor) {
		if(chave == null) return;//se ele tentar adicionar um valor a chave null, ele vai apenas sair do metodo com o return
		
		Par<C,V> novoPar = new Par<C, V>(chave, valor);
		
		if(itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		
		itens.add(novoPar);
	}
	
	
	
}
