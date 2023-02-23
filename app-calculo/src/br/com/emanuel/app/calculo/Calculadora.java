package br.com.emanuel.app.calculo;

import br.com.emanuel.app.calculo.interno.OperacoesAritimeticas;

public class Calculadora {

	private OperacoesAritimeticas opAritimeticas = new OperacoesAritimeticas();

	
	public double soma(double... nums) {
		return opAritimeticas.soma(nums);
	}
	 
	
}
