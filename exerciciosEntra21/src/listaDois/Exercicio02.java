package listaDois;
import java.util.Scanner;
public class Exercicio02 {
public static void main(String[] args) {
	float total, consumo;
	Scanner leia = new Scanner(System.in); 
	System.out.println("Insira a quantidade de minutos usados");
	consumo = leia.nextInt();
	total = (float) ((float) consumo * 0.038333333);
	System.out.println("O valor a ser pago é de $ " +total);
	
	
	
	leia.close();
	
	
	
	
}
}
