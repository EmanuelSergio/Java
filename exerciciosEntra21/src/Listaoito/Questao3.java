package Listaoito;

import java.util.Random;

public class Questao3 {

	public static void main(String[] args) {
	Random num = new Random();
	int m[][] = new int [10][10];
	int maior5 = 0, maior7 = 0, menor5 = 10, menor7 = 10;
	
	for (int i = 0; i < m.length; i++) {	
		for (int j = 0; j < m[i].length; j++) {
			m[i][j] = num.nextInt(10);
	
			if(i == 5) {
				if(maior5 <= m[i][j])
				maior5 = m[i][j];
				
			if(menor5 >= m[i][j])
				menor5 = m[i][j];
			}
			if(j == 7) {
				if(maior7 <= m[i][j])
				maior7 = m[i][j];
				
			if(menor7>= m[i][j])
				menor7 = m[i][j];
			
			}
			
		}
	}
	for (int i = 0; i < m.length; i++) {
		System.out.println("");
		for (int j = 0; j < m[i].length; j++) {
			System.out.print("[" +m[i][j] +"] ");
			System.out.print(" ");			
			
		}
	}
	System.out.println("\n"
			+ "");
	System.out.println("O menor valor da linha 5 é: " +maior5);
	System.out.println("O menor valor da linha 5 é: " +menor5);
	System.out.println("\n"
			+ "O maior valor da coluna 7 é: " +maior7);
	System.out.println("O menor valor da coluna 7 é: " +menor7);
	
	
	}

}
