package listaSeis;

import java.util.Scanner;

public class Questao9 {public static void main(String[] args) {
	
	Scanner read = new Scanner(System.in);

	int num, j=0;
	int contagem=0;
	
	System.out.println("Informe o numero");
	num = read.nextInt();
	
	
	while(num>=j) {
		j++;
	if (num % j == 0) {
		contagem++;	
	}else {
	}
	
	}
	
	if (contagem == 2) {
		System.out.println("é primo");

	}else {
		System.out.println("nao é primo");
	}
	

	read.close();
	
}

}
