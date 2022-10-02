package Construtores;

public class Questao1 {
	String marca;
	String ambiente;
	String status;
	String cor;
	int potencia;
	int voltagem;	
	boolean lampada;
	
	public void lampada() {
		
		lampada=true;
		if(lampada == true){
		status="ligada";
		
	}
	}
	
	public void lampadades() {
		
		lampada=false;
		status="desligada";
		
		
	}
	
	
	
	public Questao1(String marca, String ambiente, String status, String cor, int potencia, int voltagem,
			boolean lampada) {
		super();
		this.marca = marca;
		this.ambiente = ambiente;
		this.status = status;
		this.cor = cor;
		this.potencia = potencia;
		this.voltagem = voltagem;
		this.lampada = lampada;
	}


	void status () {
		
		System.out.println(status);
		System.out.println("Marca: "+marca );
		System.out.println("Ambiente: "+ambiente);
		System.out.println("Cor: "+cor);
		System.out.println("Potencia: "+potencia);
		System.out.println("Voltagem: "+voltagem);
		
		
		
		
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public boolean isLampada() {
		return lampada;
	}

	public void setLampada(boolean lampada) {
		this.lampada = lampada;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
