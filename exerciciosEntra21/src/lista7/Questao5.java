package lista7;

import java.util.Scanner;

public class Questao5 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);

	int[] a= new int[10];
	int num=0, soma=0;
	
	System.out.println("Informe os numeros a seguir, se ele for multiplo de 5, sera somado");
	
	for(int i =0; i<a.length; i++) {
		
		System.out.println("Informe o " +(+i+1) +"º número");
		num = leia.nextInt();
		soma = (num % 5 == 0)? soma+=num : soma;
	
	}
	
	System.out.println("A soma dos números multiplos de 5 é: " +soma);
	

	leia.close();
	
}

}
