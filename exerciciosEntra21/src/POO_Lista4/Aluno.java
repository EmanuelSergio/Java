package POO_Lista4;

public class Aluno {

	private String nome;
	private int matricula;
	private float[] notas = new float[4];
	
	public Aluno() {
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public float[] getNotas() {
		return notas;
	}
	public void setNotas(float[] notas) {
		this.notas = notas;
	}
	
	public float media(int i) {
		
		float mediaa=0;
		mediaa += notas[i];
		
		
		
		return 0;
	}
	
}
