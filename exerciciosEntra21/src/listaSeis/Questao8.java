package listaSeis;

import java.util.Scanner;

public class Questao8 {public static void main(String[] args) {
	
	Scanner read = new Scanner(System.in);

	int num=0, num1=0, meio=0;
	
	
		
		System.out.println("Informe o numero base");
		num = read.nextInt();
		System.out.println("Informe o numero final");
		num1 = read.nextInt();
		
	
		while(num<num1) {
			num++;
			if ((num % 2 == 0) && num != num1 ) {
				meio += num;
				System.out.println("A soma dos pares é: " +meio);
				
				
			}
				
	}
		
	
		System.out.println("\ntotal: " +meio);
		
				
	
		
	read.close();

	
}

}
