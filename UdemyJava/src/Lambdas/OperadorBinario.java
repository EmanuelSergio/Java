package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
public static void main(String[] args) {
	
	BinaryOperator<Double> media = (n1, n2) -> (n1+n2)/2;
	// OU :
//	BinaryOperator<Double> media = (Double n1, Double n2) -> (n1+n2)/2;
	
	System.out.println(media.apply(9.8, 5.7));
	
	/*BiFunction<Double, Double, String> resultado = 
			(n1, n2) -> ((n1+n2)/2) >= 7 ?"Aprovado":"Reprovado";*/
	
	//OU: 
			
	BiFunction<Double, Double, String> resultado = 
			(n1, n2) -> {
				double result = ((n1+n2)/2);
				return result >= 7 ?"Aprovado com média: " +result:"Reprovado com média: " +result;};
	
		System.out.println(resultado.apply(9.7, 5.1));
		
		
	Function<Double, String> conceito = m -> m >=7?"Aprovado":"Reprovado";
	
	
	System.out.println(media.andThen(conceito).apply(5.0, 9.5));
		
	
}
}
