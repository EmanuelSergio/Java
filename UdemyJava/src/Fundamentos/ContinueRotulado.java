package Fundamentos;

public class ContinueRotulado {public static void main(String[] args) {
	
	
	externo:for (int i = 0; i < 3; i++) { //rotulei o for - fez com que aquele caso do if foi pulado para o proximo
		//interno:
			for (int j = 0; j < 3; j++) {
					if(i == 1) {
						continue externo;
					}
					
					System.out.printf("[%d %d] ", i, j);
				}
				
				System.out.println();
				
				
			}
			
			System.out.println("fim");
			
	
	
}

}
