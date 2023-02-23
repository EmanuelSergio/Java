package br.com.emanuel.app.calculo.interno;

import java.util.Arrays;

public class OperacoesAritimeticas {

	public double soma(double... nums) {
		return Arrays.stream(nums).reduce(0.0, (t, a) -> t + a);
	}
	
	
	
	
}
