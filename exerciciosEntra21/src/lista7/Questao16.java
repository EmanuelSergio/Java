package lista7;

import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);

	int[] a=new int[20];
	
	for (int i = 0; i < a.length; i++) {
		System.out.println("Informe o " +(i+1) +"º numero");
		a[i] = leia.nextInt();	
	}
	
	System.out.print("\nA compactação do vetor A é: " );
	
	for (int i = 0; i < a.length; i++) {
		

		if(a[i]<=0) {
			continue;
		}else 
			a[i] = a[i];
		System.out.print(a[i] +", ");
		
	}

	leia.close();	
	}

}
