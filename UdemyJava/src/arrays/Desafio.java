package arrays;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String q = JOptionPane.showInputDialog("Informe a quantidade de notas");
		int quant = Integer.parseInt(q);
		
		double [] notas = new double[quant];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a " +(i+1) +"ª nota");
			notas[i] = leia.nextDouble();
			
		}
		
		System.out.println("notas: " +Arrays.toString(notas));
		
		double soma=0;
		for(double nota: notas) {
			soma += nota;
		}
		System.out.println("media: " +soma/notas.length);
		
		
		leia.close();
	}
	  
	
}
