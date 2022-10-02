package listaSeis;

import java.util.Scanner;

public class Questao16 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	String nome, sexo, ecv;
	int idade=0;
	float salario=0;
	
	System.out.println("Informe seu nome");
	nome = leia.next();
	
	do {
		
		
	System.out.println("Informe sua idade");	
	idade = leia.nextInt();
		
		if(idade<100 && idade>0)
			break;
		else
			System.out.println("Informe uma idade valida");
		
		
	}while(true);
	
	do {
		
		System.out.println("Informe seu salário");
		salario = leia.nextFloat();
		if(salario<=0)
			System.out.println("Informe um salário valido");
		else
			break;
			
	}while(true);
	
	do {
		
	System.out.println("Informe seu genero, Masculino ou feminino");	
	sexo = leia.next();
	
	if(sexo.equalsIgnoreCase("feminino") || sexo.equalsIgnoreCase("masculino") ) {
		break;
	}else 
		System.out.println("Informe um genero valido");
		
		
	}while(true);
	
	do {
		
		System.out.println("Informe seu estado civil, solteiro - casado - viuvo - divorciado");	
		ecv = leia.next();
		
		if(ecv.equalsIgnoreCase("solteiro") || ecv.equalsIgnoreCase("casado") || ecv.equalsIgnoreCase("viuvo") || ecv.equalsIgnoreCase("divorciado")) {
			break;
		}else 
			System.out.println("Informe um estado valido");
			
			
		}while(true);
	
	System.out.println("");
	
	System.out.println("Nome: " +nome);
	System.out.println("\n"
			+ "Idade: " +idade);
	System.out.println("\n"
			+ "Salário $" +salario);
	System.out.println("\n"
			+ "Genero: " +sexo);
	System.out.println("\n"
			+ "Estado Civil: " +ecv);
	
	
	leia.close();
	
}

}
