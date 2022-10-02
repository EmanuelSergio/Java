package Generics;

public class Par <t, u>{

	private t tipo1;
	private u tipo2;
	
	public Par() {
	}

	public Par(t tipo1, u tipo2) {
		super();
		this.tipo1=tipo1;
		this.tipo2=tipo2;
		
		
		
	}
	
	public t getTipo1() {
		return tipo1;
	}

	public void setTipo1(t tipo1) {
		this.tipo1 = tipo1;
	}

	public u getTipo2() {
		return tipo2;
	}

	public void setTipo2(u tipo2) {
		this.tipo2 = tipo2;
	}

	


	
	
}
