package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	String n1, n2, n3;
	
	System.out.println("Informe  o 1� sal�rio");
	n1 = leia.nextLine().replace(",", "."); //replace tem a funcao de fazer a virgular virar ponto, como padr�o americano
	
	System.out.println("Informe o 2� sal�rio");
	n2 = leia.nextLine().replace(",", ".");
	
	System.out.println("Informe o 3� sal�rio");
	n3 = leia.nextLine().replace(",", ".");
	
	double numero1 = Double.parseDouble(n1);
	double numero2 = Double.parseDouble(n2);
	double numero3 = Double.parseDouble(n3);
	
	double soma = numero1+numero2+numero3;
	
	System.out.println(soma);
	
	leia.close();
	
}

}
