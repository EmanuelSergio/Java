package lista7;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);

	int[] a = new int[10];
	int num=0, qp=0, qi=0, par=0, imp=0;
	
	for(int i = 0; i<a.length; i++) {
		
	System.out.println("Informe o " +(i+1) +"º número");
	num = leia.nextInt();	
	
	if(num % 2 == 0) {
	qp++;	
	}else
		qi++;
		
	par = (qp*100) /a.length;
	imp = (qi*100)/a.length;
	
	}
	
	System.out.println(par +"% são pares");
	System.out.println(imp +"% são ímpares");
	

	leia.close();
	}

}
