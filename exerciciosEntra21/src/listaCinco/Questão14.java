package listaCinco;

import java.util.Scanner;

public class Questão14 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	double saldo, perc;
	float soma;
	
	System.out.println("Informe seu saldo atual:");
	saldo = leia.nextFloat();
	
	if (saldo < 200) {
	System.out.println("Seu saldo é de $" +saldo +"\n Sem direito a credito especial");
	
	}else if ((saldo >=201) && (saldo <= 400)) {
		perc = (0.2 * saldo);
		soma = (float) ((float) perc + saldo);
		System.out.println("Seu saldo atual é de $" +saldo +"\n Seu credito especial é de $" +perc +"\n Ao total $" +soma);
		
	}else if  ((saldo >= 401) && (saldo <= 600)) {
		perc = (0.3 * saldo);
		soma = (float) ((float) perc + saldo);
		System.out.println("Seu saldo atual é de $" +saldo +"\n Seu credito especial é de $" +perc +"\n Ao total $" +soma);
		
	}else if (saldo > 601) {
		perc = (0.4 * saldo);
		soma = (float) ((float) saldo + perc);
		System.out.println("Seu saldo atual é de $" +saldo +"\n Seu credito especial é de $" +perc +"\n Ao total $" +soma);
	}
	
	leia.close();
}

}
