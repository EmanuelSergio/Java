package listaSeis;

import java.util.Scanner;

public class Questao5 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int num=0, conta=0, x=1;	
	
	System.out.println("Informe o numero: ");
	num = leia.nextInt();
	
	do {
		
	conta=x*(x+1)*(x+2);
	
	x++;
	
	}while(conta<num);

	if(num == conta) {
		System.out.println("O n� " +num +" � triangular");
		
	}else {
		System.out.println("O n� " +num +" n�o � triangular");
		
	}
	
	leia.close();
	
	
	
}

}
