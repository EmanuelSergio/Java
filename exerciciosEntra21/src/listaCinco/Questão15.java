package listaCinco;

import java.util.Scanner;

public class Questão15 { public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	String carne = "";
	double conta = 0;
	float kg, somadesc, tot = 0f;
	int desconto;
	
	
	System.out.println("Informe a carne desejada: \n"
			+ "File Duplo \n"
			+ "Alcatra \n"
			+ "Picanha");
	carne = leia.nextLine();
	
	System.out.println("Informe a quantidade em KG");
	kg = leia.nextFloat();
	
	System.out.println("Se o pagamento for com cartão, digite 1, se não, 0");
	desconto = leia.nextInt();
	
	if (carne.equalsIgnoreCase("File Duplo") && (kg < 5)) {
	conta = kg * 4.9;
	
	}else if (carne.equalsIgnoreCase("File Duplo") && (kg > 5)) {
		conta = kg * 5.8;
		

	}else if (carne.equalsIgnoreCase("Alcatra") && (kg < 5)) {
		conta = kg * 5.9;
		
		}else if (carne.equalsIgnoreCase("Alcatra") && (kg > 5)) {
			conta = kg * 6.8;
			
			
		}else if (carne.equalsIgnoreCase("Picanha") && (kg < 5)) {
			conta = kg * 6.9;
			
			}else if (carne.equalsIgnoreCase("Picanha") && (kg > 5)) {
				conta = kg * 7.8;
				
			}if (desconto == 1) {
				somadesc = (float) (0.05 * conta); 
				tot = (float) (conta - somadesc); 
				
				System.out.println("#################################################");
				
				System.out.println(carne +" = " +kg +" x valor da carne = " +conta);
				
				System.out.println("Subtotal $" +conta +"\n"
						+ "desconto de $" +somadesc +"\n"
								+ "total $" +tot);
				System.out.println("##################################################");
				
				
			}

	leia.close();
}
}
