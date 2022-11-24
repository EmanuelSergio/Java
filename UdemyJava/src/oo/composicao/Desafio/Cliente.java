package oo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	final String nome;
	final List<Compra> compras = new ArrayList<>(); 

	Cliente(String nome){
		this.nome=nome;
	}
	
	double obterValorTotal() {
		double tot=0;		
	
	for (Compra compra : compras) {
		tot += compra.obterValorTotal();
	}
	return tot;
	}
	
}
