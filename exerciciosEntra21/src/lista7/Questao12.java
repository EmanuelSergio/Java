package lista7;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	boolean x = true;
	
	int[] a = new int[3];
	
	for (int i = 0; i < a.length; i++) {
	System.out.println((i+1) +"º numero");
	a[i] = leia.nextInt();		
	}
	
	
	for (int i = 0;( i < a.length); i++) {
	x = true;	
	if(a[i] % 2 != 0) 
	x=false;	
	
	
	if (x==true) {
		System.out.println(a[i] +" é  par");
	}
	if(x==false)
		System.out.println(a[i] +" é impar");
	
		
	}
	
	
	
	
	
	
	leia.close();
		
		
	}

}
