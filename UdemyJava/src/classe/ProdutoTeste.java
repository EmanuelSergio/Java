package classe;

public class ProdutoTeste {public static void main(String[] args) {
	
	
	Produto pro = new Produto("Playstation", 5000, 0.25);
	
	pro.nome = "Iphone";
	pro.preco = 10.000;
	pro.desconto = 0.10;
	 
	pro.precoComDesconto(0);
	
	System.out.println("Valor normal: " +pro.preco
			+"\nValor com desconto: " +pro.precoComDesconto(0));
	
	
	
	
	
	
	
	
	
}

}
