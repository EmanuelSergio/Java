package listaSeis;

import java.util.Scanner;

public class Questao13 {public static void main(String[] args) {
	
	
	Scanner read = new Scanner(System.in);
int num=0, maior=0;

do {
	
	System.out.println("Insira o numero ou digite (-1) para sair: ");
	num = read.nextInt();
	
	if(num == -1) 
		break;
	
	if(num>maior) 
		maior=num;
		
	
}while(true);

	System.out.println("O maior numero digita é:" +maior);
	

	read.close();

	
	
}

}
