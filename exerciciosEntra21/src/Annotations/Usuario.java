package Annotations;

import java.time.LocalDate;

public class Usuario {

	private String nome;
	private String cpf;	
	@IdadeMinima(valor = 18)
	private LocalDate dataNascimento;
	
	public Usuario(String nome, String cpf) {
		this.nome=nome;
		this.cpf=cpf;
		
	}
	
	
	public Usuario(String string, int i, LocalDate of) {
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
		
	
	
}
