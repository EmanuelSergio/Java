package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;
		
	

	 Produto(String nomeInicial, double precoInicial, double descontoInicial) {
	preco=precoInicial;
	nome=nomeInicial;
	desconto=descontoInicial;
	 }
	 

	double precoComDesconto(double descotoDoGerente) {
		return preco * (1-desconto + descotoDoGerente); 
	}
	
	
	
	
	
	
	
}
