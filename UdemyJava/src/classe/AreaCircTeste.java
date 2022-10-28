package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		
		
		AreaCirc a = new AreaCirc(5.5);
		//a.pi=10;

		
		
		AreaCirc a2 = new AreaCirc(10);
		//a2.pi=0; forma errada de acessar, pois ele não alterar apenas o valor de a2, vai alterar para todos os valores
		
		//AreaCirc.PI=3.5;//a forma correta de acessar o valor da classe, acessar diretamente pela classe
		//se tornou inacessível por conta do "final"
		
		System.out.println(a.area());
		System.out.println(a2.area());
		
		
		
		
		//System.out.println(a.area(17));
		
		
		
		
		
	}
	
}
