package oo.composicao.Desafio.Emanuel;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	List<Compra> compras = new ArrayList<Compra>();
	
	
	Cliente(String nome){
		this.nome=nome;
	}
	
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
		
		
		
	}
	
	
	
	
	double somaTotal() {
		
		double tot =0;
		
		for (Compra compra : compras) {
			tot+=compra.somaTotal();
		}
		
	return tot;	
	}
	
	
	
	
}
