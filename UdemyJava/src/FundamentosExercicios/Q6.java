package FundamentosExercicios;

import java.util.Random;

import javax.swing.JOptionPane;

public class Q6 {

	public static void main(String[] args) {

		Random nume = new Random();
		
		int numeroAleatorio = nume.nextInt(100);
		int contador = 0;
		
		
		do {
			
			String numero = JOptionPane.showInputDialog("Informe o número");
			int num = Integer.parseInt(numero);
			
			
			 if(contador == 10) {
				System.out.println("Numero de tentativas excedido");
				break;
			}
			if(num<numeroAleatorio) {
				System.out.println("O número é maior");
				contador++;
			}else if(num>numeroAleatorio) {
				System.out.println("O numero é menor");
				contador++;

			}else if(num==numeroAleatorio) {
				System.out.println("Parabensssss");
				break;
			}
			
			
			
			
		} while (true);
		
		
		
		
		
		//System.out.println(nume.nextInt(100));
		
		
		
		
		
		
	}

}
