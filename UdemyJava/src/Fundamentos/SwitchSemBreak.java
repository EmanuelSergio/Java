package Fundamentos;

public class SwitchSemBreak {public static void main(String[] args) {
	
	String faixa = "preta";
	
	switch(faixa.toLowerCase()) { //toLowerCase faz com que ignore se a letra é maiuscula ou minuscula
	case"preta":
		System.out.println("Sei fazer todos os golpes...");
	case"marrom":
		System.out.println("Sei fazer shodan");
	case"roxa":
		System.out.println("Sei Godan");
	case"verde":
		System.out.println("Sei bater bem");
	case"laranja":
		System.out.println("To aprendedo bater bem");
	case"vermelha":
		System.out.println("Sei o Heian Nidan");
	case"amarela":
		System.out.println("Sei Shoda");
	default:
		System.out.println("Nao sei Nada ainda");
		
	}
	
	int idade=3;
	
	switch (idade) {
	case 3: 
	System.out.println("Sabe falar");	
	case 2:
		System.out.println("Sabe andar");
	case 1:
		System.out.println("Sabe respirar");
		
	}
	
	
	
	
	
	
	
	
	
}

}
