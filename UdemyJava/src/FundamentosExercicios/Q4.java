package FundamentosExercicios;

import javax.swing.JOptionPane;

public class Q4 {

	public static void main(String[] args) {

		String número = JOptionPane.showInputDialog("Informe  o número");
		
		int num1 = Integer.parseInt(número);
		int contador=0;
		
		for (int i = 2; i < num1; i++) {
			if(num1 % i == 0)
				contador++;
		}
		
		
		
		
		
		
		if(contador == 0) {
			System.out.printf("O número %d é um número primo", num1);
		}else
			System.out.printf("O número %d não é primo", num1);
		
		
		
		
		
	}

}
