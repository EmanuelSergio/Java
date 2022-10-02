package listaCinco;

import java.util.Scanner;

public class Questão17 {public static void main(String[] args) {
	
	
	Scanner leia = new Scanner(System.in);
	
	String dia;
	char op = 0;
	
	System.out.println("Informe o dia");
	op = leia.next().charAt(0);
	
	switch (op) { 
	case '1':
		dia = ("domingo");
		System.out.println(dia);
		break; 	
		
	case '2':
		dia = "segunda-feira";
		System.out.println(dia);
		break; 	
		
	case '3':
		dia = "terça-feira";
		System.out.println(dia);
		break; 	
		
	case '4':
		dia = "quarta-feira";
		System.out.println(dia);
		break; 	
	
	case '5':
		dia = "quinta-feira";
		System.out.println(dia);
		break; 	
		
	case '6':
		dia = "sexta-feira";
		System.out.println(dia);
		break; 	
		
	case '7':
		dia = "sabado";
		System.out.println(dia);
		break; 	
	}
	
	leia.close();
	
}

}
