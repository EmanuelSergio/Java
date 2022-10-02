package listaDois;
import java.util.Scanner;
public class Exercicio03 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int  folhas;
		float total;
		System.out.println("Digite a quantidade de folhas para copiar");
		folhas = read.nextInt();
		total = (float) ((float) 2 * folhas * 0.8);
		System.out.println("O valor a ser pago pelas copias, é de $" +total);
		
		
			read.close();
			
		
		
		
		
	}

}
