package Escola;

public class Professor extends Funcionario {

	private String nome;
	private String departamento;
	private String email;
	private String[]nomProf;
	
	
	
	public Professor() {
		nomProf = new String[3];
		nomProf[0] = "Fernando";
		nomProf[1] =  "Carlos";
		nomProf[2] = "Andrea";
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String[] getNomProf() {
		return nomProf;
	}

	public void setNomProf(String[] nomProf) {
		this.nomProf = nomProf;
	}

	public String obterInfo() {
		return  "Professor = " +nome;
	}
	@Override
	public float calcSalario(float vHora) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
