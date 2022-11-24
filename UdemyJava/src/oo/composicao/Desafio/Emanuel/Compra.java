package oo.composicao.Desafio.Emanuel;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Produto p, int quant) {
		this.itens.add(new Item(p ,quant));
	}
	
	void adicionarItem(String nome, double preco, int quantidade) {
		this.itens.add(new Item(new Produto(nome, preco),quantidade));
	}
	
	
	
	
	
	
}
