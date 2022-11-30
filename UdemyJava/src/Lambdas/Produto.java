package Lambdas;

public class Produto {

	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		double precofinal = preco *(1-desconto);
		return "Produto [nome= " + nome + ", preco= " + preco + ", desconto= " + desconto +", preco Final = "+precofinal +"]";
	}
	
	
	
	
}
