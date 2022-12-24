package Generics;

public class CarroGenerico<T> {

	private T nome;
	private T tipo;
	private T km;
	
	public CarroGenerico(T km, T nome, T tipo) {
		this.km=km;
		this.nome=nome;
		this.tipo=tipo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nome: " +nome +"\nkm: " +km +"\ntipo: " +tipo;
	}
	
	
}
