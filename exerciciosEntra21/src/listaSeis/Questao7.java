package listaSeis;

import java.util.Scanner;

public class Questao7 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
		int num=0, num1=0;
		
		
		
	do {
	
		System.out.println("Informe um numero  - ou '0' para sair ");
		num = leia.nextInt();
		
		if(num>100 && num<200) {
			
		num1++;	
			
		}
		
		
		
	}while(num>0);
		
	System.out.println("A quantidade de numeros entre 100 e 200 é: " +num1);
	
	leia.close();
	
}

}
