package UEC;

import java.util.Scanner;

public class Main {public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
	
	Lutador l[] = new Lutador[6];
	
	String nome;
	String nacion;
	int idade;
	float altura;
	int peso;
	int vitorias, derrotas, empates;
	
	
	System.out.println("Informe o nome do lutador");
	nome = leia.nextLine();
	System.out.println("Informe a nacionalidade do lutador");
	nacion = leia.nextLine();
	System.out.println("Informe a idade do lutador");
	idade = leia.nextInt();
	System.out.println("Informe a altura do lutador");
	altura = leia.nextFloat();
	System.out.println("informe o peso do lutador");
	peso = leia.nextInt();
	System.out.println("Informe a quantidade de vitorias do lutador");
	vitorias = leia.nextInt();
	System.out.println("Informe a quantidade de derrotas do lutador");
	derrotas = leia.nextInt();
	System.out.println("Informe a quantidade de empates do lutador");
	empates = leia.nextInt();
	
	
	 l[0] = new Lutador("Pretty boy", "França", 31,(float) 1.75, 68, 11, 2, 1);
	//l[0].apresentar();
	l[1] = new Lutador("Putscript", "brasileiro", 29, (float) 1.68, 57, 14, 2, 3);
	l[2] = new Lutador(nome, nacion, idade, altura, peso, vitorias, derrotas, empates);
	
	
	
try {

	for (int i = 0; i < l.length; i++) {
		
		l[i].status();
		
		
		
	}
	
	
} catch (Exception e) {

System.out.println("Deu certo");

} 	
	

	
	
	
	
}
}

