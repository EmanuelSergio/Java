package lista7;

import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	String res; 
	
	int[] a = new int[10];
	
	for (int i = 0; i < a.length; i++) {
		System.out.print("Digite o " + (i+1) + "º numero: ");
		a[i] = leia.nextInt();	
		res="";
		
		for (int j = 2; j <= a[i]; j++) {
			res += (a[i] % j == 0) ? ", "+j : "";
			}
	System.out.println("\n"
			+ "Divisel por: 1 " +res);	
	System.out.println("");
	}
	

	leia.close();	
	}

}
