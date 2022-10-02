package Faculdade;

public class Curso {

	private String nome;
	private int codigo;
	private int duracao;
	
	public Curso(int codigo, String nome, int duracao) {
		
		this.codigo=codigo;
		this.duracao=duracao;
		this.nome=nome;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
}
