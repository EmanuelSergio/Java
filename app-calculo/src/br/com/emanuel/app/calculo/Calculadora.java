package br.com.emanuel.app.calculo;

import br.com.emanuel.app.calculo.interno.OperacoesAritimeticas;
import br.com.emanuel.app.logging.Logger;

public class Calculadora {

	private String id = "abc";
	
	private OperacoesAritimeticas opAritimeticas = new OperacoesAritimeticas();

	
	public double soma(double... nums) {
		Logger.info("SALVE QUEBRADA");
		return opAritimeticas.soma(nums);
	}


	public String getId() {
		return id;
	}
	
	
	
}
