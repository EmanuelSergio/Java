package FundamentosExercicios;

import javax.swing.JOptionPane;

public class Q7 {

	public static void main(String[] args) {

		int soma=0;
		
		do {
			
			String n = JOptionPane.showInputDialog("Informe o n�mero");
			int num = Integer.parseInt(n);
			
			if(num>=0) {
			soma += num;
			}else if(num<0) {
				System.out.printf("A soma dos n�meros �: %d", soma);
				break;
			}
			
			
			
			
			
		} while (true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
