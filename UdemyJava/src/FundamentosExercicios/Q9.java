package FundamentosExercicios;

import javax.swing.JOptionPane;

public class Q9 {

	public static void main(String[] args) {

		int contador=0;
		int maiorNumero=0;
		
		
		
		do {
			
			String numero = JOptionPane.showInputDialog("Informe o número");
			int num = Integer.parseInt(numero);
			
			if(num > maiorNumero) {
				maiorNumero = num;
			}
			
			contador++;
			
			
			
		} while (contador != 10);
		
		System.out.printf("O maior numero digitado foi %d", maiorNumero);
		
		
		
		
		
		
	}

}
