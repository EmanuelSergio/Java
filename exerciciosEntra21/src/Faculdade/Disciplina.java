package Faculdade;

public class Disciplina {

	int codigo;
	int cargaHoraria;
	String nome;
	

	Disciplina(){
		
		System.out.println(codigo);
		System.out.println(cargaHoraria);
		System.out.println(nome);
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
