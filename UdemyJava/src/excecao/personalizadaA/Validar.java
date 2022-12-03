package excecao.personalizadaA;

import excecao.Aluno;

public class Validar {

	private Validar() {
		// TODO Auto-generated constructor stub
	}
	
	public static void aluno(Aluno aluno) {
			if(aluno==null) {
				throw new IllegalArgumentException("O aluno esta nulo");
			}
	}
	
}
