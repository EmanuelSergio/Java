package listaSeis;

import java.util.Scanner;

public class Questao14 {public static void main(String[] args) {
	
Scanner leia = new Scanner(System.in);

int qcd=0, i=0;
double valor=0, cdtot=0, mcd=0;




do {

	do {
		System.out.println("Informe a quantidade de CDs: ");
		qcd = leia.nextInt();

		if (qcd==0)
			break;
		
		 if (qcd < 0)
			System.out.println("Valor invalido");
		
		
	}while(!(qcd>0));
	
	
	for (;i < qcd; i++) {
	System.out.println("Informe o valor de cada CD");	
	valor = leia.nextDouble();
	cdtot += valor;
	mcd = cdtot / qcd;
	
	
	
	}
	System.out.println("##############################");
	System.out.println("O total gasto com os CDs foi $"  +cdtot);
	System.out.println("\n"
			+ "A media gasta por CD é: " +mcd);
	

	
	
	
	
}while (qcd==0);





leia.close();
}

}
