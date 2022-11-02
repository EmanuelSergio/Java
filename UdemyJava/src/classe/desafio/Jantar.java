package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		Comida c1 = new Comida();
		
		p1.nome="emanuel";
		p1.peso=74;
		
		c1.nome="Feijao";
		c1.peso=0.300;
		
		
		
		System.out.println(p1.comer(c1.peso));
		
		
		
		
		
	}
	
}
