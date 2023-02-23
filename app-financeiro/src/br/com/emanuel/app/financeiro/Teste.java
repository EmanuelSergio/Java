package br.com.emanuel.app.financeiro;

import java.util.ServiceLoader;

import br.com.emanuel.app.Calculadora;

public class Teste {

	public static void main(String[] args) {
		  
		
		Calculadora calc = ServiceLoader
				.load(Calculadora.class)
				.findFirst()
				.get();
		
		System.out.println(calc.soma(2,3,4));
		
		//OperacoesAritimeticas op = new OperacoesAritimeticas();
		//System.out.println(op.soma(4,5,6));
		
//		try {
//			Field fieldId = CalculadoraImpl.class.getDeclaredFields()[0];
//			fieldId.setAccessible(true);
//			fieldId.set(calc, "def");
//			fieldId.setAccessible(false);
//			
//			System.out.println(calc.getId());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		
		System.out.println();
		
		
	}
	
}
