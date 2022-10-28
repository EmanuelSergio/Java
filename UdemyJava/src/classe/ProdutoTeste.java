package classe;

public class ProdutoTeste {public static void main(String[] args) {
	
	
	Produto pro = new Produto("Playstation", 5000);
	
	var p2 = new Produto();
	
	
	p2.nome = "Iphone";
	p2.preco = 10000;
	//p2.desconto=0.3;//aqui eu estaria alterando o desconto de todos os produtos (forma incorreta)
	
	Produto.desconto = 0.5;
	 
	
	
	System.out.println(pro.nome +" " +pro.precoComDesconto());
	
	System.out.println("Valor normal: " +pro.preco
			+"\nValor com desconto: " +pro.precoComDesconto());
	
	System.out.println("");
	
	System.out.println(p2.nome +" " +p2.precoComDesconto());
	
	System.out.println("Valor normal: " +p2.preco
			+"\nValor com desconto: " +p2.precoComDesconto());
	
	
	
	
	
	
	
	
}

}
