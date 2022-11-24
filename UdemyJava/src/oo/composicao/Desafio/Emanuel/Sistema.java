package oo.composicao.Desafio.Emanuel;

public class Sistema {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Paulo Roberto Nunes");
		
		Compra c1 = new Compra();
		Produto p4 = new Produto("RTX 4090", 10000);
		
		c1.adicionarItem(p4, 2);
		c1.adicionarItem("Parati", 15000, 3);
			
		System.out.println("Soma total da primeira compra: "+c1.somaTotal());
		
		Compra c2 = new Compra();
		
		c2.adicionarItem("xbox", 3000, 10);
		
		System.out.println("Soma total da segunda compra: "+c2.somaTotal());
		
		cliente1.adicionarCompra(c1);
		cliente1.adicionarCompra(c2);
		
		System.out.println("Soma de todas as compras: " +cliente1.somaTotal());
		
		
	
		
	}

}
