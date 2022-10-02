package lista10;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno:");
		aluno1.nome = leia.next();
		
		System.out.println("Informe o nome do curso");
		aluno1.curso = leia.next();
		
		System.out.println("Informe o numero da matricula");
		aluno1.matri = leia.nextInt();
		
		for (int i = 0; i <= 2; i++) {
			System.out.println("Informe a " +(i+1) +"ª materia");
			aluno1.disciplina[i]= leia.next();
		}
		
		for (int i = 0; i < 3; i++) {
			
			System.out.println("");
			System.out.println("Materia: " +aluno1.disciplina[i]);
			
			for (int j = 0; j < 3; j++) {
				
				
				System.out.println("Informe a " +(j+1) +"ª nota");
				aluno1.nota[i][j] = leia.nextInt();
				
			}
		}
		
	
		
		aluno1.aluno();
		
		aluno1.media();
		
		leia.close();
		
	}

}
