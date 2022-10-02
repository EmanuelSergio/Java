package listaSeis;

import java.util.Scanner;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           

public class Questao1 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in); 
	
	int num = 0, par=0, imp=1, im=1;
	
	System.out.println("Informe o número positivo para somar \n"
			+ "Se o número for impar, vai ser multiplicado \n"
			+ "Ou, se for negativo ou igual a 0 sera finalizada a operação");
	

	do {
		System.out.println("\n"
				+ "informe o numero");
		num = leia.nextInt();
		
		if (num % 2 == 0) {
		par += num;	
			
		}else {
		imp *= num;	
			
		im++;
		}
		
		
	}while(num > 0);
	
	String rpar = par == 0 ? "Insira numeros pares":
		"a soma dos numeros pares é " +par;
	String rimp = im == 1 ? "Insira números impares" :
		"A multiplicação dos números impares é:" +imp;
	
	System.out.println(rpar);
	System.out.println(rimp);

	leia.close();
		
		
	
	
	
	
	
}

}
