package lista7;

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);

	int[] a = new int[10];
	int[] b = new int[a.length];
	int x = 0;
	
	
	for(int i = 0; i < 10; i++)
	{
		System.out.print("Digite o " + (i+1) + "N numero: ");
		a[i] = leia.nextInt();
	}
	

	for(int i = 9; i >= 0; i--)
	{
		b[i] = a[x];
		
		x++;
	}
	
	for(int i = 0; i < 10; i++)
	{
		System.out.printf("VetorA[%d] = %03d\t\tVetorB[%d] = %03d\n", i, a[i], i, b[i]);
	}
	

	leia.close();
	}

}
