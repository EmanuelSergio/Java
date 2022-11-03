package classe;

public class Usuario {

	String nome, email;
	
	public boolean equals(Object objeto) {
			
		if(objeto instanceof Usuario) {
			
			Usuario outro = (Usuario) objeto;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
			
		}else {
			return false;
		}
	}
	
	// o hascode sera abordade em outra aula
	
	
	
}
