package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana",7.1);
		Aluno a2 = new Aluno("Ana",6.1);
		Aluno a3 = new Aluno("Gabi",8);
		Aluno a4 = new Aluno("Gabi",8);
		Aluno a5 = new Aluno("Emanuel",10);
		Aluno a6 = new Aluno("Gustavo",7.1);
		Aluno a7 = new Aluno("Gui",10);
		Aluno a8 = new Aluno("Gui",10);
		
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		System.out.println("distinct... ");
		
		alunos.stream()
		.distinct()
		.forEach(System.out::println);//apaga repetidos
		
		System.out.println("\nSkip/Limit");
		
		alunos.stream()
		.distinct()
		.skip(2)
		.limit(2)
		.forEach(System.out::println);//pula elemntos
		
		System.out.println("\nTakeWhile");
		
		alunos.stream()
		.distinct()
		.skip(2)
		.takeWhile(a->a.nota >= 7)
		.forEach(System.out::println);//coloca requisitos(continua ate encontrar alguem q nao foi aprovado)
		
		
		
	}
	
}
