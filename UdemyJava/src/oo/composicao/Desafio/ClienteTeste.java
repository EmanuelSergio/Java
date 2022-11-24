package oo.composicao.Desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Emanuel Sergio");
		
		Compra compra1 = new Compra();
		
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Nootebook", 1897.88), 2);
		
		Compra compra2 = new Compra();
		
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 998.98), 1);
		
		c1.adicionarCompra(compra1);
		c1.adicionarCompra(compra2);
		
		
		System.out.println(c1.obterValorTotal());
		
		
		
		
		
		
		
	}
	
	
	
	
}
