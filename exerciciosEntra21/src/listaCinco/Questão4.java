package listaCinco;

import java.util.Scanner;

public class Questão4 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int codigo;
	
	System.out.println("Informe o codigo do produto");
	codigo = leia.nextInt();
	
	if (codigo == 1) {
		System.out.println("Alimento não-pericivel");
		
	}else if  ((codigo == 2)||(codigo == 3)||(codigo==4)) { 
		System.out.println("alimento pericivl");
		
	}else if ((codigo == 5)||(codigo==6)) {
		System.out.println("Vestuario");
		
	}else if (codigo == 7) {
		System.out.println("Higiene pessoal");
		
	} else if ((codigo >= 8) && (codigo <=15)){
		System.out.println("Limpeza e utensilios domesticos");
		
	} else 
		System.out.println("Invalido");
	
	leia.close();
	
	}

	

}


