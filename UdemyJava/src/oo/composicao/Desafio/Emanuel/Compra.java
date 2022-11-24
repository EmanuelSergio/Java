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
	
	double somaTotal() {
		double tot = 0;
		
		for (Item item : itens) {
			tot += item.quantidade*item.produto.preco;
		}
		
		return tot;
	}

	@Override
	public String toString() {
		return "Compra [itens=" + itens + ", somaTotal()=" + somaTotal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
