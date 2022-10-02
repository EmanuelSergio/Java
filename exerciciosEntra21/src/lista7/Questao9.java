package lista7;

import java.util.Scanner;

public class Questao9 {public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);

	int[] a = new int[10];
	int num=0, qtd=0;
	
	for (int i = 0; i < a.length; i++) {

		System.out.println("Informe a idade da " +(+i+1) +"º pessoa");
		num = leia.nextInt();
		
		if(num > 35)
			qtd++;

	}
	
	System.out.println("O número de pessoas que tem mais de 35 anos é: " +qtd);
	
	leia.close();
}

}
