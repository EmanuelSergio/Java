package Fundamentos;

import java.util.Scanner;


public class DesafioCalculadora {public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	
	System.out.println("Informe  o primero número");
	double num1 = leia.nextDouble();
	
	System.out.println("Informe a operacao");
	String op = leia.next();
	
	System.out.println("Informe o segundo número");
	double num2 = leia.nextDouble();
	
	double resultado = "+".equals(op)? num1 + num2 : 0;
	 resultado = "-".equals(op)? num1 - num2 : resultado;
	 resultado = "*".equals(op)? num1 * num2 : resultado;
	 resultado = "/".equals(op)? num1 / num2 : resultado;
	
	
	 
	
	
System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);	
	
leia.close();

}

}
