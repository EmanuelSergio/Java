package FundamentosExercicios;

import javax.swing.JOptionPane;

public class Q5 {

	public static void main(String[] args) {

String numero = JOptionPane.showInputDialog("Informe  o n�mero");
		
		int num1 = Integer.parseInt(numero);
		int contador=0;
		
		for (int i = 2; i < num1; i++) {
			if(num1 % i == 0)
				contador++;
		}
		
		switch (contador) {
		case 0:
			System.out.printf("O n�mero %d � um n�mero primo", num1);
			break;
		default:
			System.out.printf("O n�mero %d n�o � primo", num1);

			break;
		}
		
		
		
	}

}
