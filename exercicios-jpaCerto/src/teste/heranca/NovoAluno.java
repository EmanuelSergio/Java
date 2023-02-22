package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

	public static void main(String[] args) {
		
		DAO<Aluno> alunoDAO = new DAO<>();
		
		Aluno aluno = new Aluno(123, "Rafael");
		AlunoBolsista alunoBolsista = new AlunoBolsista(345L, "Lula", 1000);
		
		alunoDAO.incluirAtomico(aluno);
		alunoDAO.incluirAtomico(alunoBolsista);		
		
		
		
		alunoDAO.fechar();
	}
	
}
