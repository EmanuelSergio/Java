package listaSeis;

import java.util.Scanner;

public class Questao20 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num=0, num2=0, resp=0, soma=0;
		
		System.out.println("Informe o primeiro n�mero (menor): ");
		num = leia.nextInt();
		System.out.println("Informe o segundo n�mero (maior): ");
		num2 = leia.nextInt();
		
		do{
		num += +1;
		resp = num2-1; 
		 soma += resp;
		
		System.out.println(num);
		
		}while(num<resp);
		
		System.out.println("Sao os numeros internos");
		
		System.out.println(soma +" � a soma de todos os numeros internos");
		
		leia.close();
		
		
	}

}
