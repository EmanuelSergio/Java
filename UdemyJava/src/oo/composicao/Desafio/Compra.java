package oo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<Item> itens = new ArrayList<>(); 

	
	
	
	void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
		
	}
	
	double obterValorTotal() {
	
		double tot =0;
		
		for (Item item : itens) {
			tot+= item.quantidade*item.produto.preco;
		}
		return tot;
	}
	
	
	
	
}
