package Listaoito;

import java.util.Scanner;

public class Questao2 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	int m[][] = new int [3][3];
	int par=0, impar=0;
	
	System.out.println("Informe os numeros da seguinte matriz");
	
	for (int i = 0; i < m.length; i++) {
		for (int j = 0; j < m[i].length; j++) {

			System.out.print("matriz [" +i +"][" +j +"] ");
			m[i][j] = leia.nextInt();
			
			
			
			if(m[i][j] % 2 == 0) {
				par++;
			}else
				impar++;
		
		}	
	}
	
	
	for (int i = 0; i < m.length; i++) {
		System.out.println("");
		for (int j = 0; j < m.length; j++) {
			System.out.print("[" +m[i][j] +"] ");
			System.out.print(" ");			
			
		}
	}
	System.out.println(" ");
	System.out.println(" ");
	System.out.println("A quantidade de numeros pares é: " +par +"\n"
			+ "A quantidade de numeros impares é: " +impar);


	leia.close();
	
}

}
