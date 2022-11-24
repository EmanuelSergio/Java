package oo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	final String nome;
	final List<Compra> compras = new ArrayList<>(); 

	Cliente(String nome){
		this.nome=nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double tot=0;		
	
	for (Compra compra : compras) {
		tot += compra.obterValorTotal();
	}
	return tot;
	}
	
}
