package lista7;

import java.util.Scanner;

public class ApresentaçãoVetor {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	
	int[] vetorA = new int[5];
	int[] vetorB = new int[vetorA.length];
	
	for(int i = 0; i < vetorA.length; i++) {
		System.out.println(" Entre com o valor da posição " +i);
		vetorA[i] = leia.nextInt();
	}
	
	vetorB = vetorA;

	System.out.println("vetorA ");
	for(int i = 0; i<vetorA.length; i++) {
		System.out.println(vetorA[i] +" ");
			
	}
	
	System.out.println("vetorB ");
	for(int i = 0; i<vetorB.length; i++) {
		System.out.println(vetorB[i] +" ");
	}
	leia.close();
}

}
