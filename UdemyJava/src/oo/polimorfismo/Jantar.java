package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingrediente1 = new Arroz(0.2);
		Feijao ingrediente2 = new Feijao(0.100);
		Sorvete sobremesa = new Sorvete(0.4);
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(sobremesa);
		
		System.out.println(convidado.getPeso());
		
		
		
	}
	
}
