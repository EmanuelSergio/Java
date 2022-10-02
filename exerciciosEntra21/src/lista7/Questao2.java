package lista7;

import java.util.Scanner;

public class Questao2 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int[] a= new int[10];
	int[] b= new int[a.length];
	int[] c= new int[a.length];
	
for(int i = 0; i<a.length; i++) {
		
		System.out.println("Informe o número");
		a[i]=leia.nextInt();
		
		
		b[i]=a[i]*i;
		c[i]=a[i]%2;
		
		System.out.println("#################");

	}for(int i =0;i<b.length; i++) {
		System.out.println("A multipicação: " +b[i]);
		
		System.out.println("#################");
		
	}
	
	System.out.println("\n"
			+ "\n");
	
	for(int i = 0; i<c.length; i++) {
		System.out.println(" A divisão: " +c[i]);
		
		System.out.println("#################");

		
	}

	leia.close();
}

}
