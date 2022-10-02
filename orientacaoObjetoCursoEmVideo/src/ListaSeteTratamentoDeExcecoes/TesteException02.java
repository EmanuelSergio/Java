package ListaSeteTratamentoDeExcecoes;

import java.util.Scanner;

public class TesteException02 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	
	
	System.out.println("Eu sei dividir");
	System.out.println("Informe o primeiro valor");
	int x = leia.nextInt();
	System.out.println("Informe  o segundo valor");
	int y = leia.nextInt();
	double result = (x/y);
	System.out.println(x +" ÷ " +y +" = " +result);
	
	
	
	
	
	leia.close();
	
}

}
