package listaCinco;

import java.util.Scanner;

public class Questão2 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int num;
	
	System.out.println("Insira o numero");
	num = leia.nextInt();
	
	if (num<0) {
	System.out.println("negativo");
	
	}else if (num>0){
	System.out.println("positivo");	
	
	}else {
		System.out.println("neutro");
	
	}
	
leia.close();	
	
}

}
