package listaCinco;

import java.util.Scanner;

public class Questão11 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	double num1, num2, conta = 0;
	char operacao;
	
	System.out.println("Informe o primeiro numero");
	num1 = leia.nextDouble();
	
	System.out.println("Informe a operação a ser realizada:\n"
			+ "(+) adição (-) subtração (/) divisão (*) multiplicação" );
	operacao = leia.next().charAt(0);
	
	System.out.println("Informe o segundo numero");
	num2 = leia.nextDouble();

	
	switch (operacao) {
	case '+':
		conta = num1 + num2;	
	break;
	
	case '-':
		conta = num1 - num2;
		break;
		
	case '/':
		conta = num1 / num2;
		break;
		
	case '*':
		conta = num1 * num2;
		break;
	
	default:
		System.out.println("Operação incorreta");
	
	}
	
	System.out.println("O resultado da equação é: " +conta);
	
	
	
	leia.close();
	
	
	
}

}
