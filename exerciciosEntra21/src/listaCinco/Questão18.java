package listaCinco;

import java.util.Scanner;

public class Questão18 {public static void main(String[] args) {
	
	Scanner leia = new Scanner (System.in);
	
	String letra;
	char let;
	
	System.out.println("Informe a letra");
	let = leia.next().charAt(0);
	
	switch (let) {
	case 'a':
		letra = "vogal";
		System.out.println(letra);
		break;
		
	case 'e':
		letra = "vogal";
		System.out.println(letra);
		break;
		
	case 'i':
		letra = "vogal";
		System.out.println(letra);
		break;
		
	case 'o':
		letra = "vogal";
		System.out.println(letra);
		break;
		
	case 'u':
		letra = "vogal";
		System.out.println(letra);
		break;
		
		default:
			System.out.println("CONSOANTE");
		
	}
	
	leia.close();
	
}

}
