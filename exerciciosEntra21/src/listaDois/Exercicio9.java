package listaDois;
import java.util.Scanner;
public class Exercicio9 {public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
	
	
	
	int pessoas;
	double vcerveja, vcarne, total;
	
	System.out.println("Digite a quantidade de pessoas convidadas para o churrasco");
	pessoas = read.nextInt();
	
	vcarne = 0.5*18*pessoas;
	
	vcerveja = 6*1.7*pessoas;
	
	total = vcerveja+vcarne;
	
	System.out.println("O total a ser pago pela carne é de $" +vcarne);
	
	System.out.println("O total a ser pago pela cervceja é de $" +vcerveja);
	
	System.out.println("O valor total a ser gasto é de $" +total);
	
	read.close();
	
	
	
	
	
	
}

}
