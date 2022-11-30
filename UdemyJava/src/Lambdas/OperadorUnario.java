package Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = num -> num+2;
		UnaryOperator<Integer> vezesDois = num -> num*2;
		UnaryOperator<Integer> aoQuadrado = num -> num*num;
		
		
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		
		
		
		System.out.println(resultado1);
		
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);//faz na sequência ao contrario
		
		 System.out.println(resultado2);
		
		
		 
	}
}
