package listaCinco;

import java.util.Scanner;

public class Questão8 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	double gasolina = 2.53, etanol = 2.09, diesel = 1.92, conta;
	float litros;
	String combustivel; 
	
	System.out.println("Informe o combustivel a ser usado, Gasolina, etanol ou diesel");
	combustivel = leia.next();
	
	System.out.println("Informe quantos litros a serem colocados");
	litros = leia.nextFloat();
	
	if (combustivel.equalsIgnoreCase("gasolina")) {
		conta = litros * gasolina;
		System.out.println("O valor a ser pago pela gasolina é $" +conta);
		
	}else if (combustivel.equalsIgnoreCase("etanol") && (litros >= 30)) {
		conta = litros * etanol;
		System.out.println("O valor total do Etanol é de $" +conta +" Parabens!!! Voce ganhou uma troca de óleo");

	}else if (combustivel.equalsIgnoreCase("etanol") ) {
			conta = litros * etanol;
			System.out.println("O valor a ser pago pelo etanol é $" +conta);
		
	}else if (combustivel.equalsIgnoreCase("diesel")) {
		conta = litros * diesel;
		System.out.println("O valor a ser pago pelo diesel é $" +conta);
		
	
}

	leia.close();
	
}}
