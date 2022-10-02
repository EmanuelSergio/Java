package listaDois;
import java.util.Scanner;
public class exercicio7 {
	public static void main(String[] args) {
	Scanner read = new Scanner(System.in);	
	float peso, valor;
	
	System.out.println("Digite o peso informado na balança  em gramas");
	peso = read.nextFloat();
	valor = (float) ((float) (peso-230)*0.02);
	System.out.println("O valor da refeição foi de $" +valor);
	
		 
	read.close();	
		
		
	}

}
