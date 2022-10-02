package listaSeis;

import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leia = new Scanner(System.in);
	
	int loop=0;
	float a=0f, b=0f, porca=0f, porcb=0f;
	String s;
	
	do{
		System.out.println("Informe a população do pais A, sendo que a populaçao B é a maior ");
		a = leia.nextFloat();
		System.out.println("Informe a % de crescimento em decimais \n"
				+ "EX: 3% = 0,03");
		porca = leia.nextFloat();
		System.out.println("Informe a população do país B:");
		b = leia.nextFloat();
		System.out.println("Informe a % de crescimento em decimais \n"
				+ "EX: 3% = 0,03");
		porcb = leia.nextFloat();
		
		while (a<=b){
			
			//porca1 = porca / 100;
			//porcb1 = porcb / 100;	
			a = (a * porca) + a;
			b = (b * porcb) + b;
			loop++;
			
		}
		
		System.out.println("Levara " +loop +" anos para a população se igualar ou ultrapassar");
		System.out.println("\n"
				+ "Deseja continuar? Sim ou Nao");
		s = leia.next();
		
	}while(s.equalsIgnoreCase("sim"));
		
	System.out.println("Operação finalizada");
		
	leia.close();
	
	}

}
