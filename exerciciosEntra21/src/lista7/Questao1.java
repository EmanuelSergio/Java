package lista7;

import java.util.Scanner;

public class Questao1 {public static void main(String[] args) {
	
	
	Scanner leia = new Scanner(System.in);
	
	int[] a = new int[15];
	int[] b = new int[15];
	
	/*do {
		
		System.out.println("Informe os valores que vão ser elevado ao quadrado ");
		vetA[loop]=leia.nextInt();
		
		vetB[loop]= vetA[loop] * vetA[loop];
		loop++;
	}while(loop<3);
	
	do {

		System.out.println(loop);

		loop++;		
	}while(loop<3);*/
	
	for(int i = 0; i<a.length; i++) {
		System.out.println("Informe os valores a serem elevados ao quadrado");
		a[i] = leia.nextInt();
		b[i]= a[i]*a[i];
		
	}for(int i = 0; i<b.length; i++) {
		System.out.println("O valor ao quadrado de " +a[i] +" é " +b[i]);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	leia.close();
	
}
	

}
