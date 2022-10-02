package lista7;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);

int[] a = new int[10];
int num=0, soma=0, qtd=0,x=0, med=0, medtot=0;


for(int i = 0; i<a.length; i++) {
	
	System.out.println("Informe o " +(i+1) +"º número");
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

System.out.println("A soma dos números menores que 15 são: " +soma);
System.out.println("A quantida de números iguais a 15 é: " +qtd);
System.out.println("A media dos numeros maiores que 15 é: " +medtot);


leia.close();
	}

}
