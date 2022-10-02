package Testes;

import java.util.Scanner;

public class Main {public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	String stt;
	
	Caneta caneta = new Caneta();
	
	caneta.modelo="bic";
	caneta.ponta=1.5f;
	caneta.cor="azul";
	caneta.carga=90;
	
	
	caneta.destampar();
	caneta.tampar();
	
	
	caneta.status();
	caneta.rabiscar();
	
	System.out.println("");
	
	Caneta canet = new Caneta();
	
	canet.modelo="faber castel";
	canet.cor="azul";
	canet.carga=100;
	canet.ponta=2.0f;
	
	//canet.tampar();//para tampar
	canet.destampar();//para destampar
	
	canet.status();
	
	canet.rabiscar();
	
	System.out.println("");
	
	Caneta caneta3 = new Caneta();
	
	System.out.println("Informe o modela da caneta:");
	caneta3.modelo=leia.next();
	
	System.out.println("Informe a cor da caneta");
	caneta3.cor=leia.next();
	
	System.out.println("Informe a % da carga atual:");
	caneta3.carga=leia.nextInt();
	
	System.out.println("Informe o tamanho da ponta:");
	caneta3.ponta=leia.nextFloat();
	
	System.out.println("Informe se ela esta destampada ou tampada");
	stt = leia.next();
	
	if(stt.equalsIgnoreCase("tampada")) {
		caneta3.tampa=true;
		
	}else if(stt.equalsIgnoreCase("destampada"))
		caneta3.tampa=false;
	
	
	
	caneta3.status();
	
	
	
	leia.close();
	
}


}
