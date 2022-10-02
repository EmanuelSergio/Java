package listaSeis;

import java.util.Scanner;

public class Questao2 {public static void main(String[] args) {
	
	Scanner leia = new Scanner (System.in);
	float valor = 0;
	int cnh =0, multot=0, multotfinal=0, mult=0, cnhm=0;
	String resp;
	
	System.out.println("BEM VINDO AO DETRAN");
	
	laco1:for(;cnh !=-1;) {
 		multotfinal=0;
	
	System.out.println("\n Informe o número da CNH");
	cnh = leia.nextInt();
	
	if(cnh>cnhm)
		cnhm=cnh;
	
	if (cnh <= -1) {
		break;
	}	
	
	for(;valor != -100000;) {		
		System.out.println("Informe a quantidade de multas");
		mult = leia.nextInt();
		for(int i= 0; i < mult; i++) {
			System.out.println("Informe o valor das multas");
			valor = leia.nextFloat();	
			multot += valor;
			multotfinal += valor;	
		multot+=mult;		
		}	
		 {
			System.out.println("\n Carteira: " +cnh);
			System.out.println("\n numero de multas: " +mult);
			System.out.println("\n valor total das multas: " +multotfinal);
			
		}
		System.out.println("\n Deseja continuar? Sim ou Nao \n");
		resp = leia.next();
		
		if(resp.equalsIgnoreCase("sim")) {
			continue laco1;
		}else {
			break;
		}	
	}
	
	System.out.println("A CNH com o maior numero de multas foi: " +cnhm);
	System.out.println(" O valor total arrecadado pelo DETRAN foi $" +multot);
	}
		leia.close();	
}

}
