package Lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
public static void main(String[] args) {
	
	Produto p = new Produto("Ipad",3235.89,0.13);
	
	//double precofinal = preco *(1-desconto);
	
	//BinaryOperator<Produto> valor = (preco, desconto) -> preco.preco *(1.0-desconto.desconto) ;
	
	//BiFunction<Produto, Double, Double> valor = (preco, desconto) -> preco.preco *(1.0-desconto) ;
	
	//System.out.println(valor.apply(p, null));
	
	
	//Function<Double, String> conceito = m -> m >=7?"Aprovado":"Reprovado";
	
	//Consumer<Produto> valor = n -> System.out.println( n.preco *(1.0-n.desconto));;
	
	
	//valor.accept(p);
	
	//DoubleFunction<Produto> valor = n -> n.preco *(1.0-n.desconto);
	
	Function<Produto, Double> valor = n -> n.preco *(1.0-n.desconto);
	
	
	UnaryOperator<Double> impostoMunicipal = n -> n>=2500 ? n+(n*0.085):n;
	
	/*BiFunction<Double, Double, String> resultado = 
			(n1, n2) -> ((n1+n2)/2) >= 7 ?"Aprovado":"Reprovado";*/
	
	
	System.out.println(valor.andThen(impostoMunicipal).apply(p));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
