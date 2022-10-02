package listaCinco;

import java.util.Scanner;

public class Questão3 {public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	float alt;
	String sexo;
	float conta = 0f;
	
	
	
	System.out.println("Informe seu sexo: masculino(m) ou feminino(f)");
	sexo = leia.next();
	
	System.out.println("Informe sua altura");
	alt = leia.nextFloat();
	
	if (sexo.equalsIgnoreCase("m")) {
		conta =  (float) ((72.7*alt) -58f);

		
	}else if (sexo.equalsIgnoreCase ("f")) {
conta =	 (float) ((62.1*alt) -44.7f);	 
}
	
	System.out.println("Seu peso ideal é :" +conta);
	
	leia.close();
}

}
