package listaSeis;

import java.util.Scanner;

public class Questao19 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num=0, num2=0, resp=0;
		
		System.out.println("Informe o primeiro número (menor): ");
		num = leia.nextInt();
		System.out.println("Informe o segundo número (maior): ");
		num2 = leia.nextInt();
		
		do{
		num += +1;
		resp = num2-1; 
		 
		
		System.out.println(num);
		
		}while(num<resp);
		
		System.out.println("Sao os numeros internos");
		
		
		leia.close();
		
		
	}

}
