package listaCinco;

import java.util.Scanner;

public class Exercicio {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int dianum;
	String dia;
	
	System.out.println("Informe o dia da semana em número");
	
	dianum = leia.nextInt(); 
	
	switch (dianum) {
	
	case 1:
		dia = ("segunda-feira");
		break;
	
	case 2:
		dia=("terça-feira");
		break;
		
	case 3:
		dia=("quarta-feira");
		break;
		
	case 4:
		dia=("quinta-feira");
		break;

	case 5:
		dia=("sexta-feira");
		break;
		
	case 6:
		dia=("sabado");
		break;
		
	default:
		dia=("domingo");
		
		
	}
	
	
	System.out.println("O dia da semana informado é: " +dia);
	
	
	leia.close();
	
}

}
