package lista7;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[] a= new int[10];
		int par=0;
		
		for(int i =0; i<a.length; i++) {
			System.out.println("Informe o número");
			a[i]=leia.nextInt();
			
			if(a[i] %2 == 0) {
			System.out.println("Vetor " +i +" cujo número " +a[i] +" é par");	
				
			par++;
			
			}else 
			System.out.println("Vetor " +i +" cujo número " +a[i] +" é impar");
					
		}
		
		
		System.out.println(" \n"
				+ "O numero total de pares é " +par);
		

		leia.close();
	}

}
