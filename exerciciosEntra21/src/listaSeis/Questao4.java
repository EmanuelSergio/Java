package listaSeis;

import java.util.Scanner;

public class Questao4 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);

	int loop=1;
	float alt, altmais=0, altmenos=999, mfem=0,mfem2=0, altf=0, mpop=0, mpop2=0, phom=0, phom2=0;
	String sexo;
	
	while(loop<6) {
		
		
		
		System.out.println(loop +"º Questão, informe: \n"
				+ "Altura:" );
		alt = leia.nextFloat();
		System.out.println("Informe o genero: (masculino/feminino) ");
		sexo = leia.next();
		
		if(sexo.equalsIgnoreCase("feminino")) {
		altf++;
			mfem+=alt;
		mfem2=mfem/altf;	
		}
		
		mpop+=alt;
		mpop2=mpop/5;
		
		if(sexo.equalsIgnoreCase("masculino")) {
		phom++;
		phom2=(phom*100)/5;
		}
		
		
		if(alt>altmais) {
		altmais=alt;
		
		}if(alt<altmenos) {
			altmenos=alt;
		}
		
		
		
		
		loop++;
		
	}	
	
	System.out.println("A maior altura foi: " +altmais);
	System.out.println("A menor altura foi: " +altmenos);
	System.out.println("A media da altura feminina é : " +mfem2);
	System.out.println("A media da altura da população é " +mpop2);
	System.out.println("a porcentagem de homens sobre a população é %: " +phom2);	
	
	leia.close();
	
}

}
