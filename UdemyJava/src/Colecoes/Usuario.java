package Colecoes;

import java.util.Objects;

public class Usuario {

	String nome;

	Usuario(String nome){
		this.nome=nome;
	}
	
	@Override
	public String toString() {
		return "meu nome é: " +nome;
	}
	
	/*@Override
	public int hashCode() {
		return Objects.hash(nome);
	}*/

	/*@Override
	public int hashCode() {
		return 1;//vai retornar pra todos 1, assim então, seguindo para o equals
	}*/
	
	@Override
	public int hashCode() {
		return this.nome.length(); //está usando o tamanho do nome para o hashcode
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
			

	
	
	
}

