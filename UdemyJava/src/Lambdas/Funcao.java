package Lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		
		//ENTRA UM VALOR INTEGER E RETORNA UM VALOR STRING
		
		Function <Integer, String> parOuImpar = 
				numero -> numero% 2 == 0? "PAR" : "ÍMPAR";
		
				Integer b = 4;
		
				System.out.println(parOuImpar.apply(b));
				System.out.println(parOuImpar.apply(5));
		
		Function<String, String> empolgado = valor -> valor+"!!!";
		
		Function <Integer, String> elevado = 
				numero -> ""+ numero*numero;
				
		Function<String, String> oResultadoE = valor -> "O resulta é: " +valor;
		

				
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(b);
		
		String result = elevado.andThen(oResultadoE).apply(5);
				
		System.out.println(result);
		
		System.out.println(resultadoFinal.toLowerCase());
		
		 
		
		
		
		
	}
	
	
}
