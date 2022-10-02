package listaDois;
import java.util.Scanner;
public class Exercicio4 {public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	float tf;
	float tc;
	System.out.println("Informe a temperatura em Celsius");
	tc = leia.nextFloat();
	tf = (float) ((float) (1.8 * tc) + 32);
	System.out.println("A temperatura equivalente em graus Fahrenheit é de " +tf +"ºF");
	
	leia.close();
	
	
}

}
