package Lambdas;

public class CalculoTeste2 {
public static void main(String[] args) {
	
	
	Calculo calc = (x, y) -> {	return  x + y; };
	
	System.out.println(calc.executar(2, 3));
	
	calc = (x, y) -> x * y; //opcao de fun�ao lambda, n�o precisa de return(ele j� est� implementado)
	System.out.println(calc.executar(2, 3));
	
	System.out.println(calc.legal());
	System.out.println(Calculo.massa());
	 
	
}
}
