package lista10;

public class emanuel {
	
	String nome;
	String curso;
	int matri;
	double med;
	
	
	emanuel(){
		
	}
	
	emanuel(String nome, String curso, int matri, double med){
		this.curso= curso;
		this.nome = nome;
		this.matri = matri;
		this.med = med;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getMatri() {
		return matri;
	}

	public void setMatri(int matri) {
		this.matri = matri;
	}

	public double getMed() {
		return med;
	}

	public void setMed(double med) {
		this.med = med;
	}
	
	

}
