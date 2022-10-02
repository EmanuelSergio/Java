package Lista07;

import java.util.Scanner;


public class Questao2 {public static void main(String[] args) {
	
	
Scanner leia = new Scanner(System.in);
int y=0;
int x=0;
double r=0;

System.out.println("eu sei dividir");

do {
	
	
	try {
		
		System.out.println("Informe o primeiro valor");
		y = leia.nextInt();
		System.out.println("Informe o segundo valor");
		 x = leia.nextInt();
		
		 r = (x / y);
				
		
	} catch (Exception e) {

	System.out.println("OCORREU UM ERRO \n"
			+ "	Informe um numero diferente de 0");
	continue;
	
	
	
	}
	
	System.out.println(x +" / " +y +" = " +r);
		break;
	
}while(true);

	
leia.close();
	
}

		
}
