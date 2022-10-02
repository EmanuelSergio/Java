package Escola;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Funcionario {

	private  float salario;  
	private Date data_admissao;
	private  int horasExtras;
	
	
	public Funcionario() {
	}
	

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Date getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(Date data_admissao) {
		this.data_admissao = data_admissao;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}


	void mostrarinfo(){
		 //super.mostrar();
		System.out.println("Salario: " + this.salario);
		System.out.println("H.extras: " + this.horasExtras);
	
	}
	
	public abstract float calcSalario(float vHora);
	
//	@Override
//	public String  imprimirEtiquetaEndereco() {
//		
//		String s = "Endereço do Funcionário: ";
//		s += super.getEndereco();
//		return s;
//	}
	
}
