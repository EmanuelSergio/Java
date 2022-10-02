package Listaoito;

import java.util.Random;

public class Questao1 {public static void main(String[] args) {
		
	 Random numAle = new Random();
	int m[][] = new int [4][4];
	int maior=0, linha=0, coluna=0;
	
	
	for (int i = 0; i < m.length; i++) {	
		for (int j = 0; j < m.length; j++) {
			m[i][j] = numAle.nextInt(10);
			
			if(maior < m[i][j]) {
				maior = m[i][j];	
				linha = i;
				coluna = j;				
			}
		}
		
	}
			
	for (int i = 0; i < m.length; i++) {	
		System.out.println("");
		for (int j = 0; j < m.length; j++) {
	System.out.print(m[i][j] +" | ");
		}		
	}
	System.out.print("\n"
			+ ""
			+ "O maior numero encontrado na matriz foi: " +maior +"\n"
					+ "Na linha: " +linha +"\n"
							+ "Coluna: " +coluna);
	
}

}
