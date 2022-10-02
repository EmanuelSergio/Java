package listaCinco;

import java.util.Scanner;

public class Questão10 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int vcompra, vpagamento, troco;
	int uni, dez, cen;
	
	
	System.out.println("Informe o valor da compra: $");
	vcompra = leia.nextInt();
	
	System.out.println("Informe o valor do pagamento: $");
	vpagamento = leia.nextInt();
	
	troco = (vpagamento - vcompra);
	
	System.out.println("Troco $" +troco);
	
	
	if (vcompra > vpagamento) {
		System.out.println("Pagamento negado");
		
		
	}else {
		if  ((troco < 10) && (troco > 0)) {
		uni = troco;

		System.out.println("troco: " +uni +" notas de um, ");
		
		}else if ((troco > 9) && (troco <= 100)) {
			uni = troco % 10;
			dez = troco / 10;
			
			System.out.println("troco " +uni +" notas de um, " +dez +" notas de dez, ");
			
		}else {
		uni = (troco % 100) % 10;
		dez = (troco % 100) / 10;
		cen = troco / 100;
		
		
	System.out.println("troco " +uni +" notas de um, " +dez +" notas de dez, " +cen +" notas de cem");	
			
	}
	
	
		leia.close();
		
}

}
}







