package listaCinco;

import java.util.Scanner;

public class Questão12 {public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	String aluno;
	float n1, n2, n3, media, conta;
	
	System.out.println("Informe o nome do aluno");
	aluno = leia.next();
	
	System.out.println("Informe a primeira nota do aluno");
	n1 = leia.nextFloat();
	
	System.out.println("Informe a segunda nota do aluno");
	n2 = leia.nextFloat();
	
	System.out.println("Informe a terceira nota do aluno");
	n3 = leia.nextFloat();
	
	System.out.println("Informe a media dos exercicios");
	media = leia.nextFloat();
	
	conta = (n1 + (n2 * 2) + (n3 * 3) + media) / 7;
	
	System.out.println(conta +" é a media de " +aluno);
	
	if (conta >= 9) {
		System.out.println("Aluno conceito A");
		
	}else if ((conta >= 7.5) && (conta <=9)) {
		System.out.println("Aluno conceito B");
		
	}else if ((conta >= 6) && (conta <= 7.5)) {
		System.out.println("Aluno conceito C");
		
	}else if (conta <= 6) {
		System.out.println("Aluno conceito D");
	}
	
	leia.close();
	
}

}
