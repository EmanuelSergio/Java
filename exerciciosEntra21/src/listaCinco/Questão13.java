package listaCinco;

import java.util.Scanner;

public class Quest�o13 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	float ladoa, ladob, ladoc;
	
	System.out.println("Informe a area (A) do triangulo");
	ladoa = leia.nextFloat();
	
	System.out.println("Informe a area (B) do triangulo");
	ladob = leia.nextFloat();
	
	System.out.println("Informe a area (C) do triangulo");
	ladoc = leia.nextFloat();
	
	if ((ladoa == ladob) && (ladoc == ladob)) {
		System.out.println("Seu triangulo � Equil�tero");
		
	}else if ((ladoc == ladob) && (ladob != ladoa)){
		System.out.println("Seu triangulo � Is�sceles");
		
	}else if ((ladob == ladoa) && (ladoa != ladoc)) {
		System.out.println("Seu triangulo � Is�sceles");
		
	}else if ((ladoc == ladoa) && (ladoc != ladob)) {
		System.out.println("Seu triangulo � Is�sceles");
		
	}else if ((ladoc != ladoa) && (ladoa != ladob)) {
		System.out.println("Seu triangulo � Escaleno");
	}
	
	leia.close();
	
}

}
