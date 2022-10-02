package lista10;

import java.util.Scanner;

public class emanuel_teste {
public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	emanuel aluno = new emanuel();
	
	String nome;
	
	
	
	System.out.println("Insira o nome do aluno : ");
	aluno.setNome(nome=leia.next());
	
	System.out.println("nome : "+aluno.getNome());
	
	


	}
}
