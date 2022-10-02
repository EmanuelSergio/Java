package lista7;

import java.util.Scanner;

public class Vetor3 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int[] v1= new int[5];
	int num1=0, maior=0, menor=10000;
	
	for(int i =0; i<v1.length; i++) {
		System.out.println("Informe os números");
		v1[i]=leia.nextInt();
		num1 += v1[i];
		
		if(v1[i]>maior) {
		maior=v1[i];	
		
		}if(v1[i]<menor) {
		menor=v1[i];	
			
		}	
	}
	
	
        for(int i =0;i<v1.length; i++) {	
        if(v1[i]==maior) {
        System.out.println("Vetor ["+i+"] "+v1[i]+" é o maior valor");
        
        }else if(v1[i] == menor) {
        	System.out.println("Vetor ["+i+"] "+v1[i]+" é o menor valor");	
        }else {
        	System.out.println("Vetor ["+i+"] "+v1[i]);	
        }
}
	
        System.out.println("Soma = " +num1);
        
        leia.close();

}

}
