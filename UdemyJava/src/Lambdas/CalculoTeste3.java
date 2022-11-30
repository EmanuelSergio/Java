package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
public static void main(String[] args) {
	
	
	BinaryOperator<Double> calc = (x, y) -> {	return  x + y; };
	
	System.out.println(calc.apply(2.0, 3.0));
	
	calc = (x, y) -> x * y; //opcao de fun�ao lambda, n�o precisa de return(ele j� est� implementado)
	System.out.println(calc.apply(2.0, 3.0));
	
	
	BinaryOperator<Integer> calc2 = (x, y) -> {	return  x + y; };
	
	System.out.println(calc2.apply(2, 3));
	
	calc = (x, y) -> x * y; //opcao de fun�ao lambda, n�o precisa de return(ele j� est� implementado)
	System.out.println(calc2.apply(2, 3));

	
	
	
}
}
