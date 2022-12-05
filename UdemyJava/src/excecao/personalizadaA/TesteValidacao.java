package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacao {

	public static void main(String[] args) {
		
		
		try {
			
			Aluno a1 = new Aluno("Ana",-7);
			Validar.aluno(a1);
			
			Validar.aluno(null);
			
		} catch (StringVaziaException | NumeroForaIntervaloException | IllegalArgumentException e ) {
			System.out.println(e.getMessage());
		}
		
		try {
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumeroForaIntervaloException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("FIM");
		
		
		
	}
	
}
