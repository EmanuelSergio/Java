package lista7;

import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);

	int[] a = new int[10];
	int[] b = new int[a.length];
 	int[] c= new int[20];
 	int x=10;
 	
 	for(int i = 0; i < 10; i++)
	{
		System.out.print("Digite o " + (i+1) + "º numero: ");
		a[i] = leia.nextInt();
		c[i]=a[i];
		}
 	
 	System.out.println("\n"
 			+ "Informe os valores do vetor B\n"
 			+ "");
 	
 	for(int i = 0; i < 10; i++)
	{
		System.out.print("Digite o " + (i+1) + "º numero: ");
		b[i] = leia.nextInt();
		c[x]=+b[i];
		x++;
		}
 	System.out.println("");
 	
 	for (int i = 0; i < c.length; i++) {
 	System.out.println("\nO vetor C tem os valores de " +c[i]);	
		
	}
 	
 	
	leia.close();
	}

}
