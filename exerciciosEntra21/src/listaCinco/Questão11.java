package listaCinco;

import java.util.Scanner;

public class Quest�o11 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	double num1, num2, conta = 0;
	char operacao;
	
	System.out.println("Informe o primeiro numero");
	num1 = leia.nextDouble();
	
	System.out.println("Informe a opera��o a ser realizada:\n"
			+ "(+) adi��o (-) subtra��o (/) divis�o (*) multiplica��o" );
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
		System.out.println("Opera��o incorreta");
	
	}
	
	System.out.println("O resultado da equa��o �: " +conta);
	
	
	
	leia.close();
	
	
	
}

}
