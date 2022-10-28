package classe;

public class AreaCirc {

	
	 final static double PI = 3.1415; //static significa que a variavel pertence diretamente a classe, e não na instância 
	 //final deixa em uma forma constante, tortando impossivel acessar
	 double raio;
	
	
	//construtor
	public AreaCirc(double raioInicial) {
		raio=raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
	
	
	
	
}
