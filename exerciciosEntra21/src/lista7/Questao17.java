package lista7;

import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);

String[] a=new String[5];
int[] b=new int[5];
int loc=0;
	
	for (int i = 0; i < a.length; i++) {
		System.out.print((i+1) +"º Cliente:");
		a[i] = leia.next();	
	}
	
	System.out.println("");

	
	for (int i = 0; i < b.length; i++) {
		System.out.print("Quantidade de DVDs locados por " +a[i] +":");
		b[i] = leia.nextInt();	
		System.out.println("");
	}
	
	
	for (int i = 0; i < b.length; i++) {
	if(b[i] >= 10 && b[i] < 100) {
		loc=b[i]/10;
		System.out.println("CLIENTE: " +a[i] +"\n"
				+ "DVDs locados: " +b[i] +"\n"
						+ "Locações gratuitas disponiveis: " +loc);
		System.out.println("");
		
	}
	

	 if(b[i] >= 100 && b[i] < 1000) {
		loc=b[i]/100;	
		System.out.println("CLIENTE: " +a[i] +"\n"
				+ "DVDs locados: " +b[i] +"\n"
						+ "Locações gratuitas disponiveis: " +loc);
				System.out.println("");
	}
	 if(b[i] < 10)
		System.out.println("CLIENTE: " +a[i] +"\n"
				+ "DVDs locados: " +b[i] +"\n"
						+ "Locações gratuitas disponiveis: 0");	
	System.out.println("");
	
	
	}
	leia.close();
	}

}
