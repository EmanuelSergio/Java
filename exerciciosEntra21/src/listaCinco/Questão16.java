package listaCinco;

import java.util.Scanner;

public class Quest�o16 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int num1, num2;
	char operacao;
	double conta = 0;
	String posne = "", parim = "";
	
	System.out.println("Informe o primeiro num");
	num1 = leia.nextInt();
	
	System.out.println("Informe a opera��o a ser realizada:\n"
			+ "(+) adi��o (-) subtra��o (/) divis�o (*) multiplica��o" );
	operacao = leia.next().charAt(0);
	
	System.out.println("Informe o segundo numero");
	num2 = leia.nextInt();

	
	switch (operacao) {
	case '+':
		conta = num1 + num2;
		posne = (conta < 0) ? "Negativo" : "Positivo";
		parim = ((conta % 2) == 0) ? "Par":"Impar";
		break;
	
	case '-':
		conta = num1 - num2;
		posne = (conta < 0) ? "Negativo" : "Positivo";
		parim = ((conta % 2) == 0) ? "Par":"Impar";
		break;
		
	case '/':
		conta = num1 / num2;
		posne = (conta < 0) ? "Negativo" : "Positivo";
		parim = ((conta % 2) == 0) ? "Par":"Impar";
		break;
		
	case '*':
		conta = num1 * num2;
		posne = (conta < 0) ? "Negativo" : "Positivo";
		parim = ((conta % 2) == 0) ? "Par":"Impar";
		break;
	
	default:
		System.out.println("Opera��o incorreta");
	
	
	}	
	
	System.out.println("Resultado da opera��o: " +conta +"\n"
			+ "Seu numero � : " +posne +"\n"
					+ "E " +parim);
	
	
	
	
	
	
leia.close();	
	
}

}
