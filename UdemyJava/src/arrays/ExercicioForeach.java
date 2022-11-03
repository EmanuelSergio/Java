package arrays;

import java.util.Arrays;

public class ExercicioForeach {

	public static void main(String[] args) {
		
double[] notasAlunoA = new double [4];
		
		notasAlunoA[0]=7.9;        
		
		notasAlunoA[1]=8;
		
		notasAlunoA[2]=6.7;
		
		notasAlunoA[3]=10;
		
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		
		double totalAlunoA =0;
		for (double notaA: notasAlunoA) {
		totalAlunoA += notaA;
		}
		
		System.out.println(totalAlunoA /notasAlunoA.length);
		
		
		final double notaArmazenada = 7;
		double [] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
		
		System.out.println("\nnotas aluno B: " +Arrays.toString(notasAlunoB));
		
		double totalAlunoB =0;
		for (double notaB: notasAlunoB) {
			totalAlunoB += notaB;
			System.out.println("["+notaB+"]");
		}
		
		System.out.println(totalAlunoB/notasAlunoB.length);
		
		
		
	}
	
}
