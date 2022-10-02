package Enum;

import java.util.function.BinaryOperator;

public class Calculadora {

	
	
	public static double calcular(double x, double y, OperacaoMatematica operacao) {
		return operacao.operar(x, y);
		
		
	}
	
	
	
	
}
