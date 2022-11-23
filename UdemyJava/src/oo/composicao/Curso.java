package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	final String nome;
	final List<Aluno> alunos = new ArrayList<Aluno>();
	
	Curso(String nome){
		this.nome=nome;	}
	
	void adicionarAluno(Aluno aluno){
		this.alunos.add(aluno);//aqui ele está adicionando no array alunos
		aluno.cursos.add(this);
		
	}
	
	public String toString() {
		return nome;
	}

}
