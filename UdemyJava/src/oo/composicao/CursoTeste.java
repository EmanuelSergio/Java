package oo.composicao;

public class CursoTeste {
public static void main(String[] args) {
	
	Aluno aluno1 = new Aluno("João");
	Aluno aluno2 = new Aluno("Maria");
	Aluno aluno3 = new Aluno("Pedro");
	
	Curso curso1 = new Curso("Java Completo");
	Curso curso2 = new Curso("WEB 2023");
	Curso curso3 = new Curso("React Native");
	
	curso1.adicionarAluno(aluno1);
	curso1.adicionarAluno(aluno2);

	curso2.adicionarAluno(aluno1);
	curso2.adicionarAluno(aluno3);

	aluno1.adicionarCurso(curso3);
	aluno2.adicionarCurso(curso3);
	aluno3.adicionarCurso(curso3);
	
	for (Aluno aluno: curso1.alunos) {
		System.out.print("Curso 1 \nAluno: ");
		System.out.println(aluno.nome);
		
	}
	
	for (Aluno aluno : curso3.alunos) {
		System.out.println(aluno.nome);
		
		
	}
	
	System.out.println(aluno2.cursos.get(0).alunos);
	
	Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
	
	System.out.println("\nMetodo Curso: \n");
	
	if(cursoEncontrado !=null) {
		System.out.println(cursoEncontrado.nome);
		System.out.println(cursoEncontrado.alunos);
	}
	
	
	
}
}
