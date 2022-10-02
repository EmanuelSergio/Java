package Testes;

import java.util.Scanner;

public class Aula {
	Scanner leia = new Scanner(System.in);

	String[] assuntos = new String[3];
	String disciplina;
	String professor;
	String materia;
	int duração;
	String aula;
	boolean chata = true;
	
	
	void aula () {
		
		System.out.println("Disciplina: ");
		disciplina=leia.next();
		System.out.println("Professor: ");
		professor=leia.next();
		System.out.println("Materia ");
		materia=leia.next();
		
		for (int j = 0; j < assuntos.length; j++) {
			System.out.println(j+1 +"º Assunto");
			assuntos[j]=leia.next();
		}
		
		System.out.println("Duração: ");
		duração=leia.nextInt();
		
		System.out.println("Informe se a aula foi chata ou legal");
		aula=leia.next();
		
		if(aula.equalsIgnoreCase("chata"))
			System.out.println("Aula chata");
		else
			System.out.println("Aula legal");
	
			
	}
	

	void status() {
		
		System.out.println("");
		System.out.println(disciplina);
		System.out.println(professor);
		System.out.println(materia);
		for (int i = 0; i < assuntos.length; i++) {
			System.out.print("|" +assuntos[i] +"|");
			
		}
		
	}
	
	
	
	
}
