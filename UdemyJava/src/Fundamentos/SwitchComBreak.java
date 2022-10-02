package Fundamentos;

import java.util.Scanner;

public class SwitchComBreak {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	String conceito = "";
	
	
	
	System.out.println("Informe a nota:");
	int nota = leia.nextInt();
	
	switch(nota) {
	case 10:
	case 9:
		conceito = "A";
	break;
	case 8:
	case 7:
		conceito = "B";
		break;
	case 6:
	case 5:
		conceito = "C";
		break;
	case 4:
	case 3:
		conceito = "D";
		break;
	case 2:
	case 1:
		conceito = "F";
		break;
		default:
			conceito = "NÃO Informado";
	}
	
	System.out.println("Nota:" +conceito);
	
	leia.close();
	
}

}
