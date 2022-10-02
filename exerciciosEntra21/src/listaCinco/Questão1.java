package listaCinco;

import java.util.Scanner;

public class Questão1 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int num;
	
	System.out.println("Insira o numero");
	num = leia.nextInt();
	
	String conta = num % 2 == 0? "Positivo": "negativo";
	System.out.println(conta);
	
	leia.close();
	
}

	
	
	
}
