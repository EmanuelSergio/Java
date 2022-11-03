package arrays;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Matriz {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);
		
		String quantAluno = JOptionPane.showInputDialog("Informe a quantidade de alunos");
		int quantAlunos = Integer.parseInt(quantAluno);
		
		String q = JOptionPane.showInputDialog("Informe a quantidade de notas de cada aluno");
		int quant = Integer.parseInt(q);
		
		double [][] notas = new double[quantAlunos][quant];
		
		double soma=0;
		for (int i = 0; i < notas.length; i++) { //i representa o aluno
			System.out.println((i+1) +"º Aluno");
			for (int j = 0; j < notas[i].length; j++) {// j representa a nota
				System.out.println("Informe a "+(j+1) +"ª nota do " +(i+1) +"º aluno");
				notas[i][j] = leia.nextDouble();
				soma += notas[i][j];
				
				}
			}
		
		double media = soma / (quantAlunos*quant);
		
		System.out.println("Media da turma: " +media);
		for (double[] ds : notas) {
			
			
			System.out.println(Arrays.toString(ds));
		}
		
		
		
		/*for(double nota: notas) {
			soma += nota;
		}
		System.out.println("media: " +soma/notas.length);
		*/
		
		leia.close();
		
		
		
	}
	
}
