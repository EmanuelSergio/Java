package lista10;

public class Aluno {

	String nome, curso;
	int matri, media, med, med1;
	String disciplina[] = new String[3];
	int nota [][] = new int [disciplina.length][disciplina.length];
	
	void aluno () {
		
		System.out.println("");
		System.out.println("Nome: " +nome);
		System.out.println("");
		System.out.println("Matricula: " +matri);
		System.out.println("Curso: " +curso);
		
		System.out.println("Disciplinas: \n"
				+ ""
				+ "" +disciplina[0]);
		System.out.println(disciplina[1]);
		System.out.println(disciplina[2]);
	}
	
	void media () {
		
		
	System.out.println("");
		
		
		
	for (int i = 0; i < disciplina.length; i++) {
		
		System.out.println("");
		System.out.println("Materia: " +disciplina[i]);
		
		for (int j = 0; j < disciplina.length; j++) {
			
		 media += nota [i][j]; 	
		 System.out.print(j+1 +"ª nota:");
			System.out.print(" | " +nota[i][j]+" | ");

			
		}
		
		String  med = (media/3) >= 7 ? "Aprovado" : "Reprovado";
		med1 = media/3;	
			System.out.println("Média : " +med1 +" \n"
					+ "situação: " +med);
			
		media =0;	
	}
	
		
		
		
	}
	
}
