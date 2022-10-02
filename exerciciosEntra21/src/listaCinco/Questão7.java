package listaCinco;

import java.util.Scanner;

public class Questão7 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	double Vcompra, conta;
	String pagamento;
	double subtotal;
	
	System.out.println("Informe o valor da compra");
	Vcompra = leia.nextDouble();
	
	System.out.println("Informe a forma de pagamento. Dinheiro ou cheque?");
	pagamento = leia.next();
	
	if ((pagamento.equalsIgnoreCase("dinheiro")) && (Vcompra >= 100)) {
	subtotal = 0.10*Vcompra;
	conta = (Vcompra - subtotal);
	System.out.println("O valor total da compra com desconto, é de $" +conta);  
	
	}else
		System.out.println("O valor total da compra é de $" +Vcompra);
	
	leia.close();
	
}

}
