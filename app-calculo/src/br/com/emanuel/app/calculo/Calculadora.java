package br.com.emanuel.app.calculo;

import br.com.emanuel.app.calculo.interno.OperacoesAritimeticas;
import br.com.emanuel.app.logging.Logger;

public class Calculadora {

	private OperacoesAritimeticas opAritimeticas = new OperacoesAritimeticas();

	
	public double soma(double... nums) {
		Logger.info("SALVE QUEBRADA");
		return opAritimeticas.soma(nums);
	}
	 
	public Class<Logger> getLoggerClass(){
	return Logger.class;
	}
	
	
}
