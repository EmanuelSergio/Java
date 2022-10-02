package Construtores;

import java.util.Scanner;

public class Main2 {public static void main(String[] args) {
	

	
	Scanner leia = new Scanner(System.in);

	

	Questao2 conta = new Questao2();
	
	conta.criarConta();
	conta.deposito();
	conta.status();
	conta.saque();
	System.out.println(conta.saqueconta());
	conta.status();
	
	leia.close();
	
}

}
