package listaCinco;

import java.util.Scanner;

public class Questao6 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	double peso, altura;
	int conta;
	
	System.out.println("Informe seu peso");
	peso = leia.nextDouble();
	
	System.out.println("Informe sua altura");
	altura = leia.nextDouble();
	
	conta = (int) (peso / (altura*altura));
	
	
	if (conta < 18.5) {
		System.out.println("Abaixo do peso");
		
	}else if ((conta >= 18.5) && (conta <= 25)) {
		System.out.println("Peso normal");
		
	}else if ((conta >=26) && (conta >= 30)) {
		System.out.println("Acima do peso");
		
	}else if (conta > 30){
		System.out.println("Obeso");
		
	}else
		System.out.println("Insira uma altura ou peso valido");
	
	
	leia.close();
	
}

}
