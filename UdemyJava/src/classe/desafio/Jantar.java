package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		Comida c1 = new Comida();
		
		p1.nome="Emanuel ";
		p1.peso=74;
		
		c1.nome="Feijao";
		c1.peso=0.300;
		
		String peso = String.valueOf(p1.peso);
		
		System.out.println(p1.nome.concat(peso));
		System.out.printf("O peso de %s antes de comer %s era %.2f e após comer é %.2f", p1.nome, c1.nome, p1.peso, p1.comer(c1.peso));
		
		
		
		
		
		
	}
	
}
