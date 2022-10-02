package listaDois;
import java.util.Scanner;
public class Exercicio11 {public static void main(String[] args) {
Scanner leia = new Scanner(System.in);



int rosas, tulipas;
double total;

System.out.println("Digite a quantidade de tulipas");
tulipas = leia.nextInt();

System.out.println("Digite a quantidade de rosas");
rosas = leia.nextInt();

total = (tulipas*4.2)+(rosas*2.8);

System.out.println("O valor total da compra é de $" +total);


leia.close();

	
	
	
}

}
