package Listaoito;

import java.util.Scanner;

public class Questao06 {public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);

	char[][] velha = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}}; 
	int x=0;
	int o=0;
	char inicio = 0;
	int g=1;
	int p = 0;
	int n = 1;
	
	System.out.println("Bem vindo ao jogo da velha");
	
	
	
	
	for (int i = 0; i < velha.length; i++) {	
		System.out.println("");
		for (int j = 0; j < velha[i].length; j++) {
			System.out.print(" [ "  +velha[i][j] +" ] ");
		
		}
	}
	
	
	
	System.out.println("Informe o numero do local X");
	x = leia.nextInt();

	
for (int i = 0; i < velha.length; i++) {
	for (int j = 0; j < velha[i].length; j++) {
	if(x == n) {
		velha[i][j] = 'X';
		
	}
	n++;
	}
}	



for (int i = 0; i < velha.length; i++) {	
	System.out.println("");
	for (int j = 0; j < velha[i].length; j++) {
		System.out.print(" [ "  +velha[i][j] +" ] ");
	
	}
}

n=1;

System.out.println("Informe o numero do local O");
o = leia.nextInt();

for (int i = 0; i < velha.length; i++) {
	for (int j = 0; j < velha[i].length; j++) {
	if(o == n) {
		velha[i][j] = 'O';
	}
	n++;
	}
	}

for (int i = 0; i < velha.length; i++) {	
	System.out.println("");
	for (int j = 0; j < velha[i].length; j++) {
		System.out.print(" [ "  +velha[i][j] +" ] ");
		
	}
}
	
/*do {
	
		System.out.println("");
		
		
		System.out.println("Informe o quem vai iniciar o jogo, 'X' ou 'O' ");
		inicio = leia.next().charAt(0);
		
		
		
		
		do {
		
			for (int i = 0; i < velha.length; i++) {	
				System.out.println("");
				for (int j = 0; j < velha[i].length; j++) {
					System.out.print(" [ "  +velha[i][j] +" ] ");
				
				}
			}
			
			
		if(inicio == 'X') {
			
			System.out.println("Informe o numero do local X");
			x = leia.next().charAt(0);
			
			
				
		}else if (inicio == 'O'){
			
			System.out.println("Informe o numero do local O");
			o = leia.next().charAt(0);
		}
		
		
		
		}while(g<6);
		
		
		
		
}while(g<2);*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	

	leia.close();
}

}
