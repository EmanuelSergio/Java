package listaCinco;

import java.util.Scanner;

public class Quest�o9 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	float vFruta, conta;
	String fruta;
	int laranja = 60, limao = 80, morango = 20;
	
	System.out.println("Informe a fruta comprada");
	fruta = leia.next();
	
	System.out.println("Informe o valor unitario da fruta");
	vFruta = leia.nextFloat();
	
	if (fruta.equalsIgnoreCase( "morango")) {
		conta = morango * vFruta; 
		System.out.println("O valor da caixa de morango � $" +conta);
		
	}else if (fruta.equalsIgnoreCase("lim�o")) {
		conta = limao * vFruta;
		System.out.println("O valor da caixa de lim�o � $" +conta);
		
	}else if (fruta.equalsIgnoreCase("laranja")) {
		conta = laranja * vFruta;
		System.out.println("O valor da caixa de laranja � $" +conta);
	}
	
	leia.close();
}

}
