package FundamentosExercicios;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o n�mero");
		int num = leia.nextInt();
		
		if(num % 2 == 1)
			System.out.printf(" o n�mero %d � impar", num);
		else if(num % 2 == 0) {
			System.out.printf("O n�mero %d � par", num);
		}
		
		leia.close();
		
	}

}
