package Enum;

import java.util.Scanner;

public class TesteLambdaCalculadora {public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	do {

		double n1, n2;
		int opcao;
		boolean flag;

		System.out.println("Informe  o primeiro numero");
		n1 = leia.nextDouble();
		
		System.out.println("Informe  o segundo numero");
		n2 = leia.nextDouble();
		
		System.out.println("Escolha a opcao 1 -"
				+ OpcoesMenu.SOMAR
				+" 2 -"
				+OpcoesMenu.SUBTRAIR
				+" 3 -"
				+OpcoesMenu.MULTIPLICAR
				+" 4 -"
				+OpcoesMenu.DIVIDIR
				+" 0 -"
				+OpcoesMenu.SAIR);
		
		opcao = leia.nextInt();
		flag = FazerOperacao(opcao, n1, n2);
		
		
	} while (true);
	
}

public static boolean FazerOperacao(int opcao, double n1, double n2) {
	
	boolean t = true;
	switch(opcao) {
	case 1:
	double soma = Calculadora.calcular(n1, n2, (x, y) -> x + y);
	System.out.println(soma);
	break;
	
	case 2:
	double subtrair = Calculadora.calcular(n1, n2, (x, y) -> x-y);
	System.out.println(subtrair);
	break;
	
	case 3:
	double multiplicar = Calculadora.calcular(n1, n2, (x,y) -> x*y);
	System.out.println(multiplicar);
	break;

	case 4:
		double dividir = Calculadora.calcular(n1, n2, (x,y) -> x/y);
		System.out.println(dividir);
		break;
		
	case 0:
		t=false; 
	
	}
	
	
	return t;
	
}







}
