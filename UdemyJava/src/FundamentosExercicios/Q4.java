package FundamentosExercicios;

import javax.swing.JOptionPane;

public class Q4 {

	public static void main(String[] args) {

		String n�mero = JOptionPane.showInputDialog("Informe  o n�mero");
		
		int num1 = Integer.parseInt(n�mero);
		int contador=0;
		
		for (int i = 2; i < num1; i++) {
			if(num1 % i == 0)
				contador++;
		}
		
		
		
		
		
		
		if(contador == 0) {
			System.out.printf("O n�mero %d � um n�mero primo", num1);
		}else
			System.out.printf("O n�mero %d n�o � primo", num1);
		
		
		
		
		
	}

}
