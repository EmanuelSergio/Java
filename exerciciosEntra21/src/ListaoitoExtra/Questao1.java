package ListaoitoExtra;

import java.util.Random;

public class Questao1 {

	public static void main(String[] args) {
		
		Random num = new Random();
		
		int [][][] a = new int [10][3][5];
		int [][][] b = new int [10][3][5];
		int [][][] c = new int [10][3][5];
		
		System.out.println("Matriz A");

		
		for (int i = 0; i < a.length; i++) {
			System.out.println("");
			for (int j = 0; j < a[i].length; j++) {
			System.out.println("");
				for (int j2 = 0; j2 < c[i][j].length; j2++) {
					a[i][j][j2] = num.nextInt(10);
					
					
					System.out.print("["  +a[i][j][j2] +"]");
					
				}
			}
		}
		
		System.out.println("\n"
				+ "Matriz B:");
		
		for (int i = 0; i < c.length; i++) {
		System.out.println();
			for (int j = 0; j < c[i].length; j++) {
				System.out.println("");
				for (int j2 = 0; j2 < c[i][j].length; j2++) {
					b[i][j][j2] = num.nextInt(10);
					
					
					
					System.out.print("[" +b[i][j][j2] +"]");
					
				c[i][j][j2] = a[i][j][j2] + b[i][j][j2];	
				
				
				}
			}
		}
					
				System.out.print("\n"
						+ ""
						+ "Soma das matrizes A + B:");
				
					
					
				for (int i = 0; i < c.length; i++) {
					System.out.println();
						for (int j = 0; j < c[i].length; j++) {
							System.out.println("");
							for (int j2 = 0; j2 < c[i][j].length; j2++) {	
				
								System.out.print("[" +c[i][j][j2] +"]");
								
				}
			}
		}
		
		
		
	}

}
