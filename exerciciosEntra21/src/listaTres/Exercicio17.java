package listaTres;

import java.util.Scanner;

public class Exercicio17 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int anos;
	double dias;
	
	System.out.println("Informe a idade em anos:");
	anos = leia.nextInt();
	
	dias = anos*365.25;
	
	System.out.println("Dias vividos:" +dias);

leia.close();
	
}

}
