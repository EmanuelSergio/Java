package lista7;

import java.util.Scanner;

public class Questao11 {public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);

	int[] a = new int[10];
	int x = a.length - 1;
	boolean res = false;
	
	System.out.println("Informe uma sequencia de numeros");
	
	for (int i = 0; i < a.length; i++) {
		System.out.println((i+1) +"� numero");
		a[i] = leia.nextInt();
	}
	for (int i = 0; i < a.length/2; i++) {
		if(a[i] == a[x]) {
			x--;
			res = true;
			
		}else {
			x--;
			res = false;
			break;
		}
		
	}
	if(res==true) {
		System.out.println("O vetoremos informados s�o uma sequencia de pal�ndromos");
		
	}else
		System.out.println("Os vetores informados n�o s�o uma sequencia de pal�ndromos");
	
	
	

	leia.close();
}

}
