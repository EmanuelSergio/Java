package listaDois;
import java.util.Scanner;
public class Exercicio6 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	float total;
	int qdias;
	
	System.out.println("Digite a quantidade de dias em atraso");
	qdias = leia.nextInt();
	total = (float) ((float) qdias * 2.5);
	System.out.println("O valor a ser pago pela multa é de "
			+ "" +total +" reais");
	
	leia.close();
	
}

}
