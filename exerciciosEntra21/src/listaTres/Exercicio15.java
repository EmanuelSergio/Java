package listaTres;

import java.util.Scanner;

public class Exercicio15 {public static void main(String[] args) {
	
Scanner leia = new Scanner(System.in);

double area, Lquad;

System.out.println("Digite o valor do quadrado");
Lquad = leia.nextDouble();

area = Lquad*Lquad;

System.out.println("A área do quadrado é:" +area);

leia.close();

}

}
