package lista7;

import java.util.Scanner;

public class Questao6 {public static void main(String[] args) {
	
Scanner leia = new Scanner(System.in);

int[] a = new int[10];
int num=0, soma=0, med=0, d=0;

System.out.println("Informe os numeros, os numeros �mpares v�o ser somados sua media aritm�tica");

for(int i = 0; i<a.length; i++) {
	
	System.out.println("Informe o " +(i+1) +"� n�mero");
	num = leia.nextInt();
	
	if(num % 2 == 1) {
		d++;
		soma+=num;	
		med=soma/d;
	}
}

System.out.println("A m�dia aritm�tica simples dos n�meros �mpares �: " +med);

leia.close();	
	
}

}
