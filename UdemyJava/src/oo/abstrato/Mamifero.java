package oo.abstrato;

public abstract class Mamifero extends Animal{
	
	public abstract String mamar();
	
	@Override
	final public String mover() {
		// TODO Auto-generated method stub
		return "O animal está se movendo";
	}
	
}
