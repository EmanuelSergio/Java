package FundamentosExercicios;

import javax.swing.JOptionPane;

public class Q5 {

	public static void main(String[] args) {

String número = JOptionPane.showInputDialog("Informe  o número");
		
		int num1 = Integer.parseInt(número);
		int contador=0;
		
		for (int i = 2; i < num1; i++) {
			if(num1 % i == 0)
				contador++;
		}
		
		switch (contador) {
		case 0:
			System.out.printf("O número %d é um número primo", num1);
			break;
		default:
			System.out.printf("O número %d não é primo", num1);

			break;
		}
		
		
		
	}

}
