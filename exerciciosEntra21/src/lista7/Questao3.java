package lista7;

import java.util.Scanner;

public class Questao3 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int[] a= new int[10];
	int[] b= new int[a.length];
	int[] c= new int[a.length];
	float[] cdiv= new float[a.length];
	
	System.out.println("VETOR A");
	
		for(int i = 0; i<a.length; i++) {
		
		System.out.println("Informe o n�mero " +i);
		a[i]=leia.nextInt();
	
		}
		
		System.out.println("VETOR B");
		
		for(int i = 0; i<b.length; i++) {
			
			System.out.println("Informe o n�mero " +i);
			b[i]=leia.nextInt();
	
			
			
			
		}for(int i = 0; i<c.length; i++) {
			
			c[i] = a[i] + b[i];
			System.out.println("A soma dos vetores " +i +" �: " +a[i] +" + " +b[i] +" = " +c[i]);			
			
		}
		
		System.out.println("");
		
		for(int i = 0; i<c.length; i++) {

			c[i] = a[i] - b[i];
			System.out.println("A subtra��o dos vetores " +i +" �: " +a[i] +" - " +b[i] +" = " +c[i]);			
			
		}
		
		System.out.println("");
		
		for(int i = 0; i<c.length; i++) {

			c[i] = a[i] * b[i];
			System.out.println("A multiplica��o dos vetores " +i +" �: " +a[i] +" * " +b[i] +" = " +c[i]);			
			
		}
		
		System.out.println("");
		
		for(int i = 0; i<c.length; i++) {

			cdiv[i] = a[i] / b[i];
			System.out.println("A divis�o dos vetores " +i +" �: " +a[i] +" / " +b[i] +" = " +cdiv[i]);			
			
		}
			

	leia.close();
	
}

}
