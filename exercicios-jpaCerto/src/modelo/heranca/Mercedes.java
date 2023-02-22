package modelo.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Luxo")
public class Mercedes extends Carro{
	
	private String tipoMotor;
	
	private boolean turbo;

	public Mercedes() {
		// TODO Auto-generated constructor stub
	}

	public Mercedes(String nome ,String cor,String tipoMotor, boolean turbo) {
		super(nome,cor);
		this.tipoMotor = tipoMotor;
		this.turbo = turbo;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public boolean isTurbo() {
		return turbo;
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	 
	
	
	
}
