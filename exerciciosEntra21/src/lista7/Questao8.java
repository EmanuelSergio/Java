package lista7;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);

int[] a = new int[10];
int num=0, soma=0, qtd=0,x=0, med=0, medtot=0;


for(int i = 0; i<a.length; i++) {
	
	System.out.println("Informe o " +(i+1) +"� n�mero");
	num = leia.nextInt();
	
	if(num<15) 
	soma+=num;	
	
	else if(num == 15)
	qtd++;
	
	else if(num>15) {
		x++;
		med += num;
		medtot = med/x;		
		
	}
}

System.out.println("A soma dos n�meros menores que 15 s�o: " +soma);
System.out.println("A quantida de n�meros iguais a 15 �: " +qtd);
System.out.println("A media dos numeros maiores que 15 �: " +medtot);


leia.close();
	}

}
