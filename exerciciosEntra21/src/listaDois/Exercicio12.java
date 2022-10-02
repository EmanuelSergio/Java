package listaDois;
import java.util.Scanner;
public class Exercicio12 {public static void main(String[] args) {
Scanner leia = new Scanner(System.in);

int pacote, fotoAvulsa;
double total;

System.out.println("digite a quantidade de fotos avulsas para revelar");
fotoAvulsa = leia.nextInt();

System.out.println("Digite a quantidade de pacotes a serem revelados");
pacote = leia.nextInt();

total = (pacote*44)+(fotoAvulsa*0.70);

System.out.println("O valor total a ser pago, é de $" +total);



	leia.close();
	
	
	
	
	
}

}
