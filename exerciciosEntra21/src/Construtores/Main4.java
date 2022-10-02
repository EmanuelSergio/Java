package Construtores;

public class Main4 {public static void main(String[] args) {
	
	Questao4 velha = new Questao4();
	
	while(true) {
		velha.tabuleiro();
		velha.resultado();
		velha.geraResult();
		
		if(!velha.geraResult().equalsIgnoreCase("")) {
			System.out.println(velha.geraResult());
			break;
		}
		
		velha.jogada();
		
	}
	
	System.out.println("FIM");
}

}
