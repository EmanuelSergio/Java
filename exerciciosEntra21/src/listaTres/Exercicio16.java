package listaTres;

import java.util.Scanner;

public class Exercicio16 {public static void main(String[] args) {

	
Scanner leia = new Scanner(System.in);

double receita, despesas, percent, lucro;

System.out.println("Digite o valor da receita");
receita = leia.nextDouble();

System.out.println("Digite o valor das despesas");
despesas = leia.nextDouble();

lucro = receita-despesas;

percent = (lucro/receita)*100;

System.out.println("O lucro foi de R$" +lucro +", e o percentual de lucro da empresa em relação à receita foi de " +percent +"%");
	
	
	
	leia.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	
}
