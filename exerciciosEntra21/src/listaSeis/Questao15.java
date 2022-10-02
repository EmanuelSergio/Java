package listaSeis;

import java.util.Scanner;

public class Questao15 {public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
	
	int cod, senha;

	do {
		
		System.out.println("Informe seu codigo: ");
		cod = leia.nextInt();
		
		System.out.println("Informe sua senha: ");
		senha=leia.nextInt();
		
		if(cod!=senha) {
			break;
		}else{
		System.out.println("\n"
				+ "A senha deve ser diferente do codigo");	
		}
			
		
		
	}while(true);
	
	System.out.println("LOGIN EFETUADO COM SUCESSO");
	
	leia.close();
	
}

	
}
